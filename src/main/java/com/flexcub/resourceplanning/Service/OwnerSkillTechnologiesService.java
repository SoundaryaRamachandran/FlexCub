package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillTechnologiesEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillTechnologiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerSkillTechnologiesService {

    @Autowired
    OwnerSkillTechnologiesRepository ownerSkillTechnologiesRepository;
    public List<OwnerSkillTechnologiesEntity> getDataTech() {
        return ownerSkillTechnologiesRepository.findAll();
    }


    public OwnerSkillTechnologiesEntity insertDataTech(OwnerSkillTechnologiesEntity ownerSkillTechnologiesEntity) {
        ownerSkillTechnologiesRepository.save(ownerSkillTechnologiesEntity);
        return ownerSkillTechnologiesEntity;
    }

    public void deleteDataTech(int id) {
        ownerSkillTechnologiesRepository.deleteById(id);
    }
}
