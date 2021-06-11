package com.example.soaDesigner;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController{
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "hello");
        return "welcome";
    }

    @RequestMapping("/System")
    public String system(@RequestParam( required = false, name = "architectureName") String archName, Model model){
        model.addAttribute("systemName", archName);
        return "editor";
    }


}