package com.cn.ben.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ljh
 * @Date: 2019/8/6 15:16
 * @Description:
 */
@Controller
public class EgController {
    @RequestMapping("/")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("/image");
        ArrayList arr = new ArrayList();
        arr.add("50");
        arr.add("#2dc6c8");
        arr.add("瓜子");
        List<ArrayList> result = new ArrayList<>();
        result.add(arr);

//[50,"#2dc6c8","瓜子"], [100,"#b6a2dd", "花生"], [200,"#5ab1ee","土豆"], [700,"#d7797f","南瓜四号"], [70,"#d7797f","四号"]
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public String passParam(Map <String, Object> map){
//
//        map.put("message1", "Hello, Spring Boot!");
//
//        map.put("message2", "Hello, Spring Boot!");
//
//        User user = new User(18, "Bruce");
//
//        map.put("user", user);
//
//        return "result";
//
//    }