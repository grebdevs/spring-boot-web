package se.kits.svedberg.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import se.kits.svedberg.model.Personal;
import se.kits.svedberg.model.Team;
import se.kits.svedberg.repository.PersonalRepository;
import se.kits.svedberg.repository.TeamRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@Component
public class Init implements ApplicationRunner {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    PersonalRepository personalRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        createPersonal();
    }

    private void createPersonal() {
        Set<Team> teams = new HashSet<>();

        teams.add(new Team("Brynäs IF", Team.Sport.HOCKEY, "SHL"));
        teams.add(new Team("Ottawa Senators", Team.Sport.HOCKEY, "NHL"));
        teams.add(new Team("Bollnäs GIF", Team.Sport.BANDY, "Elitserien"));
        teamRepository.save(teams);

        personalRepository.save(new Personal(
                "Pär Svedberg",
                1982,
                3,
                "Göteborg",
                "Bagaregården",
                teams
        ));
    }
}
