package com.flexcub.resourceplanning.Repository;

import com.flexcub.resourceplanning.Entity.OwnerSkillSetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerSkillSetRepository extends JpaRepository <OwnerSkillSetEntity ,Integer> {
}
