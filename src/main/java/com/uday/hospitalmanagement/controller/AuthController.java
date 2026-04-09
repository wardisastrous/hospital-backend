package com.uday.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.*;
import com.uday.hospitalmanagement.util.JwtUtil;
import com.uday.hospitalmanagement.entity.User;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")   // ✅ ONLY ONE (fixes CORS)
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        if ("admin".equals(user.getUsername()) &&
            "admin123".equals(user.getPassword())) {

            return jwtUtil.generateToken(user.getUsername());
        }

        throw new RuntimeException("Invalid credentials");
    }
}

