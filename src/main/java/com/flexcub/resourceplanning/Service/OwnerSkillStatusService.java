package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillStatusEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerSkillStatusService {

    @Autowired
    OwnerSkillStatusRepository ownerSkillStatusRepository;

    public List<OwnerSkillStatusEntity> getDataStatus() {

        return ownerSkillStatusRepository.findAll();
    }

    public OwnerSkillStatusEntity insertDataStatus(OwnerSkillStatusEntity ownerSkillStatusEntity) {
        ownerSkillStatusRepository.save(ownerSkillStatusEntity);
        return ownerSkillStatusEntity;
    }

    public void deleteDataStatus(int id) {
        ownerSkillStatusRepository.deleteById(id);
    }
}
