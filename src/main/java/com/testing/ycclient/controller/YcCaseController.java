package com.testing.ycclient.controller;

import com.testing.ycclient.mapper.YcCaseMapper;
import com.testing.ycclient.model.YcCase;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yccase")
public class YcCaseController {

    @Autowired
    YcCaseMapper ycCaseMapper;

    @PostMapping
    public int addCase(@RequestBody YcCase ycCase){
        int i=ycCaseMapper.addCase(ycCase);
        System.out.println("执行操作的结果是："+i);
        return  i;
    }
    @DeleteMapping({"/{id}"})
    public int delCase(@PathVariable Long id){
        int i=ycCaseMapper.delCase(id);
        return i;
    }
    @PutMapping
    public  int updateCase(@RequestParam  String author){
        int i=ycCaseMapper.updateCase(author);
        return  i;
    }


//    @DeleteMapping("/{ids}")
//    public int delectcase(){
//
//    }


}
