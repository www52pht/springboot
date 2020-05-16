package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ResponseBody
 * @Controller
 * 上面这两个注解可以用@RestController代替(因为restcontroller这个注解里面也是
 * @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Controller
 * @ResponseBody几个注解组成)
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        return "你开心就行！";
    }
}
