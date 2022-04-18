package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillLevelEntity;
import com.flexcub.resourceplanning.Entity.OwnerSkillSetEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillLevelService;
import com.flexcub.resourceplanning.Service.OwnerSkillSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/OwnerSkillLevel")
public class OwnerSkillLevelController {
    @Autowired
    OwnerSkillLevelService ownerSkillLevelService;

    @GetMapping(value = "/getlevel")
    public List<OwnerSkillLevelEntity> getDetails(){
        return ownerSkillLevelService.getDatalevel();
    }

    @PostMapping(value = "/insertDatalevel")
    public OwnerSkillLevelEntity insertDetails(@RequestBody OwnerSkillLevelEntity ownerSkillLevelEntity){
        return ownerSkillLevelService.insertDatalevel(ownerSkillLevelEntity);
    }

    @DeleteMapping(value = "/deleteDataset")
    public void deleteDetails(@RequestParam int id){
        ownerSkillLevelService.deleteDatalevel(id);
    }
}
