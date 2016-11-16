package se.kits.svedberg.repository;

import se.kits.svedberg.model.Experience;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Pär Svedberg on 2016-10-24.
 */
public interface ExperienceRepository extends CrudRepository<Experience, Long> {

    @Override
    List<Experience> findAll();
}
