package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "api/v1")
public class DemoController {
   
    @Autowired
    HttpServletRequest request;

  @GetMapping("/version")
  public String getVersion(){
    return "Version 1";
  }

    @GetMapping("/ip")
    public String getMethodName() {
        String clientIp = request.getHeader("X-Forwarded-For");
        if (clientIp == null || clientIp.isEmpty()) {
            clientIp = request.getHeader("X-Real-IP");
        }
        if (clientIp == null || clientIp.isEmpty()) {
            clientIp = request.getRemoteAddr();
        }
        return "La IP del cliente es: " + clientIp;
    }

}
