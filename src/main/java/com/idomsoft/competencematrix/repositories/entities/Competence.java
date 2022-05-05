package com.idomsoft.competencematrix.repositories.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "competence")
public class Competence implements Serializable{

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "competencename")
    private String comptenceName;

    @OneToMany(mappedBy = "competence")
    Set<Rating> ratings;

    public Competence() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComptenceName() {
        return comptenceName;
    }

    public void setComptenceName(String comptenceName) {
        this.comptenceName = comptenceName;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }
}
