package com.cove.bloom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
<<<<<<< HEAD
    public String defaultPage() {
=======
    public String defaultPage(){
>>>>>>> origin/main
        return "main";
    }

    @GetMapping("main")
    public void main() {}

}

