package com.petstore.backend.repository;

import com.petstore.backend.model.Role;
import com.petstore.backend.model.RoleEnum;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
