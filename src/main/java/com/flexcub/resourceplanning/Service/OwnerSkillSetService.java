package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillSetEntity;
import com.flexcub.resourceplanning.Entity.SkillOwnerEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerSkillSetService {
    @Autowired
    OwnerSkillSetRepository ownerSkillSetRepository;

    public List<OwnerSkillSetEntity> getDataset() {
        return ownerSkillSetRepository.findAll();
    }

    public OwnerSkillSetEntity insertDataset(OwnerSkillSetEntity ownerSkillSetEntity) {
         ownerSkillSetRepository.save(ownerSkillSetEntity);
        return ownerSkillSetEntity;
    }

    public void deleteDataset(int id) {
    }
}
