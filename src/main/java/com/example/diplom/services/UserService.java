package com.example.diplom.services;


import com.example.diplom.entity.Role;
import com.example.diplom.entity.User;
import com.example.diplom.repositories.RoleRepository;
import com.example.diplom.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public boolean createUser(User user) {
        String email = user.getLogin();
        if (userRepository.findByEmail(user.getLogin()) != null) return false;
        user.setActive(true);
        for (Role role : roleRepository.findAll()){
            if (role.getName().contains("Simple_User")){
                user.setRole_id(role);
            }
        }
        log.info ("Сохранение пользователя c почтой: " + email);
        return true;
    }

}
