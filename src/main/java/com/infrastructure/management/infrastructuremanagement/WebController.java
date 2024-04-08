package com.infrastructure.management.infrastructuremanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/home")
    public  String index() {
        return "index.html";
    }

    // Add other controllers as needed
}
