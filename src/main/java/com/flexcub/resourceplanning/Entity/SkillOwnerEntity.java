package com.flexcub.resourceplanning.Entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="skill_owner")
@Getter
@Setter
@Where(clause = "deleted_at is null")
public class SkillOwnerEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int skillOwnerEntityId;

//    @Column(nullable = false)
//    @OneToOne(targetEntity = SkillPartner.class)
//    @JoinColumn(nullable = false, name = "pk_id")
//    private int skillPartnerId;


    @ManyToOne(targetEntity = OwnerSkillSetEntity.class)
    @JoinColumn( name = "pk_id")
    private int skillOwnerId;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @Column(nullable = false)
    private Date dOB;

    @Column(nullable = false, columnDefinition = "text")
    private String primaryEmail;

    @Column(columnDefinition = "text")
    private String alternateEmail;

    @Column(nullable = false, length = 10, columnDefinition = "text")
    private String phoneNumber;

    @Column(columnDefinition = "text")
    private Text alternatePhoneNumber;

    @OneToMany(targetEntity = OwnerSkillStatusEntity.class)
    @JoinColumn(nullable = false, name = "pk_id")
    private boolean status;

    public  SkillOwnerEntity() {
        super();
        this.status = false;
    }
}


