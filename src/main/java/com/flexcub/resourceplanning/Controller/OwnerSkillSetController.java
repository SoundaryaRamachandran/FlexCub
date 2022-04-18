package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillSetEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/OwnerSkillSet")
public class OwnerSkillSetController {
    @Autowired
    OwnerSkillSetService ownerSkillSetService;

    @GetMapping(value = "/getset")
    public List<OwnerSkillSetEntity> getDetails(){
        return ownerSkillSetService.getDataset();
    }

    @PostMapping(value = "/insertDataset")
    public OwnerSkillSetEntity insertDetails(@RequestBody OwnerSkillSetEntity ownerSkillSetEntity){
        return ownerSkillSetService.insertDataset(ownerSkillSetEntity);
    }

    @DeleteMapping(value = "/deleteDataset")
    public void deleteDetails(@RequestParam int id){
        ownerSkillSetService.deleteDataset(id);
    }


}
