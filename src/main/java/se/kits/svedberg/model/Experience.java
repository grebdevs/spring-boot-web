package se.kits.svedberg.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pär Svedberg on 2016-10-18.
 */

@Entity
public class Experience implements Serializable {

    private static final long serialVersionUID = 6638538957472080217L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String workplace;

    @Column(nullable = false)
    private String title;

    private String responsibilities;
    private String duration;

    protected Experience() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public Experience(String workplace, String title, String responsibilities, String duration) {
        this.workplace = workplace;
        this.title = title;
        this.responsibilities = responsibilities;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
