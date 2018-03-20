package com.example.helloa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 弗拉基米尔 on 2018/3/20.
 */
@RestController
@RequestMapping("/")
public class HelloAController {

    @RequestMapping(value = "/helloa", method = RequestMethod.POST)
    public Object helloa() {
        return "{\"hello\": “A\"}";
    }
}
