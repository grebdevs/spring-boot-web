package se.kits.svedberg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.kits.svedberg.model.Team;
import se.kits.svedberg.repository.TeamRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@RestController
@RequestMapping("/svedberg/team")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Collection<Team>>> getTeams() {
        Map teams = new HashMap<>();
        teams.put("favorite teams", teamRepository.findAll());
        return new ResponseEntity<Map<String, Collection<Team>>>(teams, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Team> getTeam(@PathVariable("id") long id) {
        Team team = teamRepository.findOne(id);
        if (team == null) {
            return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Team>(team, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Team> createTeam(@RequestBody Team team) {
        return new ResponseEntity<Team>(teamRepository.save(team), HttpStatus.CREATED);
    }
}
