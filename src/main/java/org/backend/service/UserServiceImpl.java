package org.backend.service;

import org.backend.data.User;
import org.backend.entity.UserEntity;
import org.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(List<User> user) throws Exception {

        List<UserEntity> userEntities = user.stream().map(user1 ->
             new UserEntity(user1.getId(),user1.getName(),user1.getSalary(),
                    user1.getEmail(),user1.getAddress(),user1.getDob())
        ).toList();
        userEntities.forEach(System.out::println);

        userRepository.saveAll(userEntities);
    }

}
