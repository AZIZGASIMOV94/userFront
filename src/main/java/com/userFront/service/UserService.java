package com.userFront.service;

import com.userFront.domain.User;
import com.userFront.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);

    boolean checkUserExists(String username, String emil);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);

    void save (User user);

    User createUser(User user, Set<UserRole> userRoles);

}
