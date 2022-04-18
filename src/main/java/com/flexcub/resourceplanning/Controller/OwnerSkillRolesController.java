package com.flexcub.resourceplanning.Controller;

import com.flexcub.resourceplanning.Entity.OwnerSkillRolesEntity;
import com.flexcub.resourceplanning.Service.OwnerSkillRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/v1/OwnerSkillRoles")
public class OwnerSkillRolesController {

    @Autowired
    OwnerSkillRolesService ownerSkillRolesService;

    @GetMapping(value = "/getlevel")
    public List<OwnerSkillRolesEntity> getDetailsroles(){
        return ownerSkillRolesService.getDataroles();
    }

    @PostMapping(value = "/insertDatalevel")
    public OwnerSkillRolesEntity insertDetails(@RequestBody OwnerSkillRolesEntity ownerSkillRolesEntity){
        return ownerSkillRolesService.insertDataroles(ownerSkillRolesEntity);
    }

    @DeleteMapping(value = "/deleteDataset")
    public void deleteDetails(@RequestParam int id){
        ownerSkillRolesService.deleteDataroles(id);
    }
}
