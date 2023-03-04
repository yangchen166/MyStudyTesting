package com.testing.ycclient.controller;

import com.testing.ycclient.model.Cases;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/case")
public class CaseController {

    public List<Cases> casesList=new ArrayList<>();

    @GetMapping
    public List<Cases> getCasesList(){
        return casesList;
    }

    @PostMapping("/url")
    public String addCase(Cases cases){
        casesList.add(cases);
        return "case添加完成";
    }

    @PostMapping
    public String addJsonCase(@RequestBody  Cases jsoncases){
        casesList.add(jsoncases);
        return "通过Json case添加完成";
    }

    @PutMapping("/{id}")
    public List<Cases> changeCase(@PathVariable String id,String name){
        for (Cases cases : casesList) {
            if (cases.getId().equals(id)) {
                cases.setName(name);
            }
        }
        return casesList;
    }


    @DeleteMapping("/{ids}")
    public List<Cases> deleteCases(@PathVariable String[] ids){
        for (String id:ids){
            for(Cases cases:casesList){
                if(cases.getId().equals(id)){
                    casesList.remove(cases);
                    break;
                }}
        }
        return casesList;
    }


}



