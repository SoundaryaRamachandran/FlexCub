package com.flexcub.resourceplanning.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner_skill_technologies")
@Getter
@Setter
@Where(clause = "deleted_at is null")

public class OwnerSkillTechnologiesEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int technologyId;

    @Column(nullable = false)
    private String technologyValues;

    private boolean status;
    public OwnerSkillTechnologiesEntity() {
        super();
        this.status = false;
    }
}
