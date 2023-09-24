package org.microservice.service;

import org.microservice.exception.custom.UserException;
import org.microservice.model.User;
import org.microservice.repository.MicroRepo;
import org.microservice.service.interfaces.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MicroServiceImpl implements MicroService {

    @Autowired
    private MicroRepo microRepo;

    @Override
    public void saveUser(User user) {
        org.microservice.entity.User user1 = new org.microservice.entity.User();
        user1.setId(user.getId());
        user1.setAddress(user.getAddress());
        user1.setName(user.getName());
        user1 = null;
        if (user1==null){
            throw new UserException("user1 is null");
        }
        microRepo.save(user1);
    }
}
