package com.karishma.task_management.service;

import com.karishma.task_management.exception.EmailAlreadyExists;
import com.karishma.task_management.model.dto.SignupRequest;
import com.karishma.task_management.model.dto.SignupResponse;
import com.karishma.task_management.model.entity.User;
import com.karishma.task_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public SignupResponse registerUser(SignupRequest request)
    {
        if (userRepository.findByEmail(request.getEmail()).isPresent())        {
            throw new EmailAlreadyExists("Email already exists");
        }
        String hashedPassword = passwordEncoder.encode(request.getPassword());
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(hashedPassword)
                .role(request.getRole())
                .build();
         userRepository.save(user);
         return new SignupResponse("User created",user.getEmail());
    }
}
