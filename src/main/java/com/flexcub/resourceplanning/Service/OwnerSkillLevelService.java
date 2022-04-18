package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillLevelEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerSkillLevelService {
    @Autowired
    OwnerSkillLevelRepository ownerSkillLevelRepository;

    public List<OwnerSkillLevelEntity> getDatalevel() {
        return ownerSkillLevelRepository.findAll();
    }

    public OwnerSkillLevelEntity insertDatalevel(OwnerSkillLevelEntity ownerSkillLevelEntity) {
        ownerSkillLevelRepository.save(ownerSkillLevelEntity);
        return ownerSkillLevelEntity;
    }

    public void deleteDatalevel(int id) {
        ownerSkillLevelRepository.deleteById(id);
    }
}
