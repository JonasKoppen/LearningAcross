package com.modular.monlith.demo.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/applicationKey")
    public String applicationKey(Model model){
        model.addAttribute("applicationKey", "DEMO");
        return "th/demo/applicationKey";
    }
}
