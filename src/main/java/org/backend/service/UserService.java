package org.backend.service;

import org.backend.data.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    void saveUser(List<User> user) throws Exception;
}
