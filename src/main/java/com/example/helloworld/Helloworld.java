package com.example.helloworld;
import org.springframework.web.bind.annotation.RestCoontroller;
import org.springframework.web.bind.annotation.GetMapping;
@GetController
public class Helloworld{
        @GetMapping("/")
        public String helloworld(){
           return "syam";
       }
}