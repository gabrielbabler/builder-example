package com.gbabler.service;

import com.gbabler.model.dto.UserRequest;
import com.gbabler.model.dto.UserResponse;
import com.gbabler.model.entity.UserDomain;
import com.gbabler.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse saveNewUser(UserRequest userRequest) {
        log.info("userRequest: {}", userRequest);

        UserDomain newUser = new UserDomain.UserDomainBuilder()
                .name(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .age(userRequest.getAge())
                .build();

        log.info("newUser: {}", newUser);

        UserDomain userSaved = userRepository.save(newUser);

        log.info("userSaved: {}", userSaved);

        UserResponse userResponse = new UserResponse.UserResponseBuilder()
                .name(userSaved.getName())
                .age(userSaved.getAge())
                .build();

        log.info("userResponse: {}", userResponse);

        return userResponse;
    }
}
