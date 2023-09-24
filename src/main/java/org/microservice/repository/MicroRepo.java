package org.microservice.repository;

import org.microservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroRepo extends JpaRepository<User,Long> {
}
