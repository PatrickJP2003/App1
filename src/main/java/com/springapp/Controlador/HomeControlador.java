package com.springapp.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlador {

    @GetMapping("/home")
    public String Indexs(){
        return "index.html";
    }
}