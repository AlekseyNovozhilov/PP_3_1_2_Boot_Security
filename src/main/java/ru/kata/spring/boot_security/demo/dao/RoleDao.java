package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;


import java.util.List;
import java.util.Optional;

public interface RoleDao {
    Role findById(Long id);

    List<Role> getAllRoles();

    Role findRoleByName(String name);
}
