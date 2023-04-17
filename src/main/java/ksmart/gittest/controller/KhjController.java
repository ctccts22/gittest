package ksmart.gittest.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KhjController {
    @RequestMapping("/khj")
    public String khj(Model model){
        return "khj/KHJ";
    }
    @RequestMapping("/khj2")
    public String khj2(Model model){ return "khj/KHJ2"; }
}
