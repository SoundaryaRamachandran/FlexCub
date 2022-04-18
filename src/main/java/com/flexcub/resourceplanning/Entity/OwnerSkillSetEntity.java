package com.flexcub.resourceplanning.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="owner_skill_set")
@Getter
@Setter
@Where(clause = "deleted_at is null")
public class OwnerSkillSetEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int ownerSkillSetId;

    @OneToOne(targetEntity = OwnerSkillLevelEntity.class)
    @JoinColumn(nullable = false, name = "pk_id")
    private OwnerSkillLevelEntity ownerSkillLevelEntity;

    @OneToOne(targetEntity = OwnerSkillTechnologiesEntity.class)
    @JoinColumn(nullable = false, name = "pk_id")
    private OwnerSkillTechnologiesEntity ownerSkillTechnologiesEntity;

    @OneToOne(targetEntity = OwnerSkillRolesEntity.class)
    @JoinColumn(nullable = false, name = "pk_id")
    private OwnerSkillRolesEntity ownerSkillRolesEntity;

    @OneToOne(targetEntity = OwnerSkillDomainEntity.class)
    @JoinColumn(nullable = false, name ="pk_id" )
    private OwnerSkillDomainEntity ownerSkillDomainEntity;

    @Column(nullable = false)
    private  int expYears;

    @Column(nullable = false)
    private Date lastUsed;
}
