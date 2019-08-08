package com.cn.ben.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Auther: ljh
 * @Date: 2019/8/6 15:16
 * @Description:
 */
@Controller
public class EgController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String passParam(Map <String, Object> map){

        map.put("message1", "Hello, Spring Boot!");

        map.put("message2", "Hello, Spring Boot!");

        User user = new User(18, "Bruce");

        map.put("user", user);

        return "result";

    }
}
