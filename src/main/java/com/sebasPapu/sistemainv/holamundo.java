package com.sebasPapu.sistemainv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")

public class holamundo {
    @GetMapping("/holamundo")
    public String holamundo(){

        return "hola mundo";
        

    }

}