package com.flexcub.resourceplanning.Controller;


import com.flexcub.resourceplanning.Entity.SkillOwnerEntity;
import com.flexcub.resourceplanning.Service.SkillOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/SkillOwner")
public class SkillOwnerController {

    @Autowired
    SkillOwnerService skillOwnerService;

    @GetMapping(value = "/get")
    public List<SkillOwnerEntity> getDetails(){
        return skillOwnerService.getData();
    }

    @PostMapping(value = "/insertData")
    public SkillOwnerEntity insertDetails(@RequestBody SkillOwnerEntity skillOwnerEntity){
        return skillOwnerService.insertData1(skillOwnerEntity);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteDetails(@RequestParam int id){
        skillOwnerService.deleteData(id);
    }

}
