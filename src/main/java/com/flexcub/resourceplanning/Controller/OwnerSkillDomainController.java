package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillDomainEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/OwnerSkillDomain")
public class OwnerSkillDomainController {
    @Autowired
    OwnerSkillDomainService ownerSkillDomainService;

    @GetMapping(value = "/getdomain")
    public List<OwnerSkillDomainEntity> getDetails(){
        return ownerSkillDomainService.getDatadomain();
    }

    @PostMapping(value = "/insertDatadomain")
    public OwnerSkillDomainEntity insertDetails(@RequestBody OwnerSkillDomainEntity ownerSkillDomainEntity){
        return ownerSkillDomainService.insertDatadomain(ownerSkillDomainEntity);
    }

    @DeleteMapping(value = "/deleteDatadomain")
    public void deleteDetails(@RequestParam int id){
        ownerSkillDomainService.deleteDatadomain(id);
    }

}
