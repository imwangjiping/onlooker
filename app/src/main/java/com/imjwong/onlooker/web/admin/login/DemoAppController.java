package com.imjwong.onlooker.web.admin.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DempRest class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
@Controller
@RequestMapping("/login")
public class DemoAppController {

    @GetMapping
    public String login() {
        return "login";
    }

}
