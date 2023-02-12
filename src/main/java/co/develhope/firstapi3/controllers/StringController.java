package co.develhope.firstapi3.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String getString(@RequestParam String a, @RequestParam(required = false) String b){
        if (b == null) {
            return a;
        }else{
            return a.concat(b);
        }
    }

}