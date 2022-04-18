package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillLevelEntity;
import com.flexcub.resourceplanning.Entity.OwnerSkillRolesEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerSkillRolesService {
@Autowired
    OwnerSkillRolesRepository ownerSkillRolesRepository;
    public List<OwnerSkillRolesEntity> getDataroles() {
        return ownerSkillRolesRepository.findAll();
    }

    public OwnerSkillRolesEntity insertDataroles(OwnerSkillRolesEntity ownerSkillRolesEntity) {
        ownerSkillRolesRepository.save(ownerSkillRolesEntity);
        return ownerSkillRolesEntity;
    }

    public void deleteDataroles(int id) {
        ownerSkillRolesRepository.deleteById(id);
    }
}
