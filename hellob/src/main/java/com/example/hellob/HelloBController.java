package com.example.hellob;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 弗拉基米尔 on 2018/3/20.
 */
@RestController
@RequestMapping("/")
public class HelloBController {

    @RequestMapping(value = "/hellob", method = RequestMethod.POST)
    public Object hellob() {
        return "{\"hello\": “B\"}";
    }
}
