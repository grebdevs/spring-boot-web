package se.kits.svedberg.repository;

import org.springframework.data.repository.CrudRepository;
import se.kits.svedberg.model.Personal;
import se.kits.svedberg.model.Team;

/**
 * Created by Pär Svedberg on 2016-10-24.
 */
public interface TeamRepository extends CrudRepository<Team, Long> {

}
