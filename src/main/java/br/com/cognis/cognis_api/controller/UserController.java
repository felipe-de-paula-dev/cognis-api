package br.com.cognis.cognis_api.controller;

import br.com.cognis.cognis_api.entity.user.UserJpaEntity;
import br.com.cognis.cognis_api.entity.user.dto.UserCreateRequest;
import br.com.cognis.cognis_api.entity.user.dto.UserResponse;
import br.com.cognis.cognis_api.entity.user.mapper.UserMapper;
import br.com.cognis.cognis_api.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiUsers")
public class UserController {

    @Autowired
    private UserJpaRepository repo;

    @Autowired
    private UserMapper mapper;

    @PostMapping
    public UserResponse createUser(@RequestBody UserCreateRequest userCreateRequest){
        UserJpaEntity userToCreate = mapper.toEntity(userCreateRequest);
        UserJpaEntity createdUser = repo.save(userToCreate);
        return mapper.toDto(createdUser);
    }
}
