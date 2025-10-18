package com.karishma.task_management.controller;


import com.karishma.task_management.model.dto.SignupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/signup")
    public SignupResponse registerUser(@RequestBody SignupRequest request)
    {

    }
}
