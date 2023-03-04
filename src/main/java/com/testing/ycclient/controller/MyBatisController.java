package com.testing.ycclient.controller;

import com.testing.ycclient.mapper.YcCaseMapper;
import com.testing.ycclient.model.Cases;
import com.testing.ycclient.model.YcCase;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/myTest")
public class MyBatisController {
    @Autowired
    YcCaseMapper ycCaseMapper;

    @GetMapping
    public String getDatas(){
        List<Map<String,Object>> datas= ycCaseMapper.getDatas();
        System.out.println("查询到的数据是"+datas);
        return datas.toString();
    }

    @GetMapping("/cases")
    public List<YcCase> listCases(){
        List<YcCase> cases= ycCaseMapper.getCases();
        System.out.println(cases);
        return cases;
    }

    @GetMapping("/wrongcases")
    public List<Cases> WrongCases(){
        List<Cases> cases= ycCaseMapper.getwrongCases();
        System.out.println(cases);
        return cases;
    }

    @GetMapping("/{stepName}")
    public List<YcCase> StepName(@PathVariable String stepName){
        List<YcCase> yccase= ycCaseMapper.getCasesByStep(stepName);
        System.out.println(yccase);
        return yccase;
    }




}
