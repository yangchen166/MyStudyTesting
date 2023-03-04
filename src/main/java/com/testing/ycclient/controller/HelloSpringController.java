package com.testing.ycclient.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloSpringController {
    @GetMapping("/spring")
    public String hello(){
        System.out.println("调用了hello接口");
        return "hell0,Success!";
    }
    @GetMapping("/{id}")
    public String helloid(@PathVariable String id) {
        return "这是编号" + id + "的网页";
    }
    @GetMapping()
    public String helloname(@RequestParam String name,@RequestParam String age){
        return "名字是"+name+",age="+age;
    }
    @GetMapping("/w")
    public String hellow(@RequestParam String name,@RequestParam String age){
        return "名字是"+name+",age="+age;
    }
    @GetMapping("/m/{hobby}")
    public String hellow(@PathVariable String hobby){
        return "爱好是"+hobby;
    }
}
