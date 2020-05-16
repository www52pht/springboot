package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController可以取代下面两个注解（可以进@RestController里面就明白了）
 * @ResponseBody
 * @Controller
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        return "你开心就行！23333";
    }
}
