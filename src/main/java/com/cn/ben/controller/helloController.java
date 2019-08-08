package com.cn.ben.controller;

import com.cn.ben.controller.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther: ljh
 * @Date: 2019/8/5 14:09
 * @Description:
 */
@Controller
public class helloController {
 @RequestMapping("/demo/{id}")
 public String vod (@PathVariable(name = "id") String id){
  return id;
}

    @ResponseBody
    @GetMapping({"/id"})
    public String id(@RequestParam("the_Param") String id) {
        return "id:" + id;
    }
//  @RequestMapping("/hell/{name}")
//  String put(@PathVariable String name){
//
//        return "hello"+name;
//  }

}
