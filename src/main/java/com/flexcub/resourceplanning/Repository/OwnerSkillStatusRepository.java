package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.OwnerSkillStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSkillStatusRepository extends JpaRepository<OwnerSkillStatusEntity,Integer> {
}
