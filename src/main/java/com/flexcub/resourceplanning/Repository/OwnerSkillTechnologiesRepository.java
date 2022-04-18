package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.OwnerSkillTechnologiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSkillTechnologiesRepository extends JpaRepository<OwnerSkillTechnologiesEntity,Integer> {

}
