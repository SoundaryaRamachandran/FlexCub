package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.SkillOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillOwnerRepository extends JpaRepository <SkillOwnerEntity,Integer> {
}