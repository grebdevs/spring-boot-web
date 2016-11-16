package se.kits.svedberg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Pär Svedberg on 2016-10-27.
 */
@Entity
@Table(name = "personal_info")
public class Personal implements Serializable {

    private static final long serialVersionUID = 23774209647858590L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private int birthday;
    private int familySize;

    private String city;
    private String district;

    @OneToMany
    private Set<Team> favoriteTeams;

    public Personal() {
    }

    public Personal(String name, int birthday, int familySize, String city, String district, Set<Team> favoriteTeams) {
        this.name = name;
        this.birthday = birthday;
        this.familySize = familySize;
        this.city = city;
        this.district = district;
        this.favoriteTeams = favoriteTeams;
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Set<Team> getFavoriteTeams() {
        return favoriteTeams;
    }

    public void setFavoriteTeams(Set<Team> favoriteTeams) {
        this.favoriteTeams = favoriteTeams;
    }
}
