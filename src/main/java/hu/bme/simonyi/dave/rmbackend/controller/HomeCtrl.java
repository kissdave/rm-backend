package hu.bme.simonyi.dave.rmbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dkiss on 2017. 03. 16..
 */
@Controller
public class HomeCtrl {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "view";
    }
}
