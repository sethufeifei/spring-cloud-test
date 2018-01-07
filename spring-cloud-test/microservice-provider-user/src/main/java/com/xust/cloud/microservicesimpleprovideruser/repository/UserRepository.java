package com.xust.cloud.microservicesimpleprovideruser.repository;

import com.xust.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * description:
 * microservice-simple-provider-user-
 *
 * @Author hufeifei
 * @create 2018-01-05 11:05
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
