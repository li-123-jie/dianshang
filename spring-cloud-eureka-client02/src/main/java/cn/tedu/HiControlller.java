package cn.tedu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiControlller {
    @RequestMapping("hi")
    public String sayHi(String name){
        return "hello world " + name +",i am from 9002";
    }
}
