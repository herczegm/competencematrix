package com.idomsoft.competencematrix.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RatingKey implements Serializable {

    @Column(name = "userid")
    Long userId;

    @Column(name = "competenceid")
    Long competenceId;

    public RatingKey(){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCompetenceId() {
        return competenceId;
    }

    public void setCompetenceId(Long competenceId) {
        this.competenceId = competenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingKey ratingKey = (RatingKey) o;

        if (userId != null ? !userId.equals(ratingKey.userId) : ratingKey.userId != null) return false;
        return competenceId != null ? competenceId.equals(ratingKey.competenceId) : ratingKey.competenceId == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (competenceId != null ? competenceId.hashCode() : 0);
        return result;
    }
}
