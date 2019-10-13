package com.sessionui.version1.service;

import com.sessionui.version1.dto.SignUpUserDTO;
import com.sessionui.version1.model.User;
import com.sessionui.version1.model.enums.Role;
import com.sessionui.version1.model.enums.State;
import com.sessionui.version1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpUserDTO signUpUserDTO) {

        User user = User.builder()
                .login(signUpUserDTO.getUsername())
                .hashPassword(passwordEncoder.encode(signUpUserDTO.getPassword()))
                .role(Role.ROLE_USER)
                .state(State.ACTIVE).build();
        userRepository.save(user);

    }
}
