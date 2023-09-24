package org.microservice.service.interfaces;

import org.microservice.model.User;
import org.springframework.stereotype.Service;

@Service
public interface MicroService {
    void saveUser(User user);
}
