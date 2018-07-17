package com.example.springlesson_20;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
    User findByUsername(String username);
}
