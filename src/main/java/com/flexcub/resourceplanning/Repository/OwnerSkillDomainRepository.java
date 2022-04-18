package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.OwnerSkillDomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSkillDomainRepository extends JpaRepository <OwnerSkillDomainEntity,Integer>{
}
