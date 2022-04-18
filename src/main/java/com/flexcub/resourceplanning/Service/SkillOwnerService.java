package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.SkillOwnerEntity;
import com.flexcub.resourceplanning.Repository.SkillOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class SkillOwnerService {

    @Autowired
    SkillOwnerRepository skillownerRepository;

    public List<SkillOwnerEntity> getData() {
        return skillownerRepository.findAll();
    }

    public SkillOwnerEntity insertData1(SkillOwnerEntity skillOwnerEntity) {
        skillownerRepository.save(skillOwnerEntity);
        return skillOwnerEntity;
    }

    public void deleteData(int id) {
        skillownerRepository.deleteById(id);
    }
}
