package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {
    @Autowired
    DemoRepository demoRepository;
    @Autowired
    HttpServletRequest request;

    @GetMapping("test/{id}")
    public String getMethodName(@PathVariable int id) {
        Optional<DemoEntity> dato = demoRepository.getEntidad(id);
        if (dato.isPresent()) {
            return dato.get().getDato();
        }
        return "Dato no Encontrado";
    }

    @GetMapping("get/ip")
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
