package com.uday.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.*;
import com.uday.hospitalmanagement.util.JwtUtil;
import com.uday.hospitalmanagement.entity.User;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        if(user.getUsername().equals("admin") && user.getPassword().equals("admin123")) {
            return jwtUtil.generateToken(user.getUsername());
        }

        throw new RuntimeException("Invalid credentials");
    }
}