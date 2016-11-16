package se.kits.svedberg.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Pär Svedberg on 2016-10-18.
 */
@SpringBootApplication(scanBasePackages = {"se.kits.svedberg.controller"}, scanBasePackageClasses = Init.class)
@EnableJpaRepositories(basePackages = {"se.kits.svedberg.repository"}, considerNestedRepositories = true)
@EntityScan(basePackages = {"se.kits.svedberg.model"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}