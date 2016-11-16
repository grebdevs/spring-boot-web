package se.kits.svedberg.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@Entity
public class Team implements Serializable {

    private static final long serialVersionUID = 1688772279303051431L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Sport sport;

    private String league;

    public Team() {
    }

    public Team(String name, Sport sport, String league) {
        this.name = name;
        this.sport = sport;
        this.league = league;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public enum Sport {
        HOCKEY, FOOTBALL, BANDY
    }
}
