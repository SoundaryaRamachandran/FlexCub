package com.flexcub.resourceplanning.Service;

import com.flexcub.resourceplanning.Entity.OwnerSkillDomainEntity;
import com.flexcub.resourceplanning.Repository.OwnerSkillDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerSkillDomainService {

    @Autowired
    OwnerSkillDomainRepository ownerSkillDomainRepository;

    public List<OwnerSkillDomainEntity> getDatadomain() {
        return ownerSkillDomainRepository.findAll();
    }

    public OwnerSkillDomainEntity insertDatadomain(OwnerSkillDomainEntity ownerSkillDomainEntity) {
        ownerSkillDomainRepository.save(ownerSkillDomainEntity);
        return ownerSkillDomainEntity;
    }

    public void deleteDatadomain(int id) {
        ownerSkillDomainRepository.deleteById(id);
    }
}
