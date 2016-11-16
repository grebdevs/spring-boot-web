package se.kits.svedberg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.kits.svedberg.repository.ExperienceRepository;
import se.kits.svedberg.repository.PersonalRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@RestController
@RequestMapping("/svedberg")
public class DefaultController {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private PersonalRepository personalRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map> getAll() {
        Map<String, Iterable> parts = new HashMap();
        parts.put("personal", personalRepository.findAll());
        parts.put("experience", experienceRepository.findAll());
        Map topMap = new HashMap();
        topMap.put("data", parts);
        return new ResponseEntity<Map>(topMap, HttpStatus.OK);
    }
}
