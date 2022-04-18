package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillStatusEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/OwnerSkillStatus")
public class OwnerSkillStatusController {
    @Autowired
    OwnerSkillStatusService ownerSkillStatusService;

    @GetMapping(value = "/get")
    public List<OwnerSkillStatusEntity> getDetailsStatus(){
        return ownerSkillStatusService.getDataStatus();
    }

    @PostMapping(value = "/insertData")
    public OwnerSkillStatusEntity insertDetailsStatus(@RequestBody OwnerSkillStatusEntity ownerSkillStatusEntity){
        return ownerSkillStatusService.insertDataStatus(ownerSkillStatusEntity);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteDetailsStatus(@RequestParam int id){
        ownerSkillStatusService.deleteDataStatus(id);
    }
}
