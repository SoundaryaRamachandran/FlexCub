package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.OwnerSkillRolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSkillRolesRepository extends JpaRepository<OwnerSkillRolesEntity,Integer> {
}
