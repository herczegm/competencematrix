package com.idomsoft.competencematrix.repositories.entities;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @EmbeddedId
    RatingKey id;

    @ManyToOne
    @MapsId ("userId")
    @JoinColumn(name = "userid")
    User user;

    @ManyToOne
    @MapsId("competenceId")
    @JoinColumn(name = "competenceid")
    Competence competence;

    @Column(name = "value")
    private Integer value;
}
