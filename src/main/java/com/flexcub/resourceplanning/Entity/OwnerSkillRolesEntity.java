package com.flexcub.resourceplanning.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner_skill_roles")
@Getter
@Setter
@Where(clause = "deleted_at is null")
public class OwnerSkillRolesEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int rolesId;

    @Column(nullable = false)
    private String rolesDescription;

}
