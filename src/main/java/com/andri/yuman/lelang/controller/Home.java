package com.andri.yuman.lelang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Andri_2
 * Date: 9/28/16
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class Home {

    @RequestMapping("/")
    public String index() {
        return "Hello World rest";
    }

}
