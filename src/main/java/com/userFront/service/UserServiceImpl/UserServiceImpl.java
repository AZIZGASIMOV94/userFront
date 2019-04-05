package com.userFront.service.UserServiceImpl;

import com.userFront.Dao.UserDao;
import com.userFront.domain.User;
import com.userFront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save(User user){
        userDao.save(user);
    }

    public User findByUsername(String username){
        return userDao.findByUsername(username);
    }

    public User findByEmail(String email){
        return userDao.findByEmail(email);
    }
    public boolean checkUserExists(String username, String email){
        if(checkUsernameExists(username)|| checkEmailExists(email)){
            return true;

        }else{
            return false;
        }
    }
    public boolean checkUsernameExists(String username){
        if(findByUsername(username) != null){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkEmailExists(String email){
        if(findByEmail(email) != null){
            return true;
        }else {
            return false;
        }
    }

}
