package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillStatusEntity;
import com.flexcub.resourceplanning.Entity.OwnerSkillTechnologiesEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillStatusService;
import com.flexcub.resourceplanning.Service.OwnerSkillTechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/OwnerSkillTechnologies")
public class OwnerSkillTechnologiesController {
    @Autowired
    OwnerSkillTechnologiesService ownerSkillTechnologiesService;

    @GetMapping(value = "/get")
    public List<OwnerSkillTechnologiesEntity> getDetailsTech(){
        return ownerSkillTechnologiesService.getDataTech();
    }

    @PostMapping(value = "/insertData")
    public OwnerSkillTechnologiesEntity insertDetailsStatus(@RequestBody OwnerSkillTechnologiesEntity ownerSkillTechnologiesEntity){
        return ownerSkillTechnologiesService.insertDataTech(ownerSkillTechnologiesEntity);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteDetailsStatus(@RequestParam int id){
        ownerSkillTechnologiesService.deleteDataTech(id);
    }
}
