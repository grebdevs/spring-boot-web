package se.kits.svedberg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import se.kits.svedberg.model.Personal;
import se.kits.svedberg.repository.PersonalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@RestController
public class PersonalController {

    @Autowired
    private PersonalRepository personalRepository;

    @RequestMapping(value = "/svedberg/personal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Collection<Personal>>> getPersonalInfos() {
        Map personalInfo = new HashMap<>();
        personalInfo.put("personal info", personalRepository.findAll());
        return new ResponseEntity<Map<String, Collection<Personal>>>(personalInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/svedberg/personal/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Personal> getPersonalInfo(@PathVariable("id") Long id) {
        Personal info = personalRepository.findOne(id);
        if (info == null) {
            return new ResponseEntity<Personal>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Personal>(info, HttpStatus.OK);
    }
}
