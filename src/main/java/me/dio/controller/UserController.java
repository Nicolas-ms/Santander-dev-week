package me.dio.controller;

import me.dio.domain.model.User;
import me.dio.domain.model.dto.UserDTO;
import me.dio.service.UserService;
import me.dio.mapper.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
       var user = userService.findById(id);
       var userDTO = UserMapper.toDTO(user);
       return ResponseEntity.ok(userDTO);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userToCreate) {
        var userCreated = userService.create(UserMapper.toEntity(userToCreate));
        var userCreatedDTO = UserMapper.toDTO(userCreated);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreatedDTO.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreatedDTO);
    }
}
