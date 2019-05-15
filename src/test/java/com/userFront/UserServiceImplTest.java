package com.userFront;

import com.userFront.dao.UserDao;
import com.userFront.domain.User;
import com.userFront.domain.security.UserRole;
import com.userFront.service.UserService;
import com.userFront.service.UserServiceImpl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    private static final Long USER_ONE_ID =1L;

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl userService;

    private User userDoc;
    private Set<UserRole> userRole;

    @Before
    public void init(){
        User user = new User();
        user.setUserId(USER_ONE_ID);
        user.setEmail("gasimovaziz@gmail.com");

        user.setEmail("abc@gmail.com");
    }

    @Test(expected = ApiException.class)
    public void createUserAndUserExists(){
        //data prep
        Mockito.when(userDaoMock.findByEmail("gasimovaziz@gmail.com")).thenReturn(userDoc);

        //Method call
        User user = userService.createUser(userDoc, userRole);

        //verification
        Assert.assertNull(user);
        Mockito.verify(userDaoMock,Mockito.times(1)).findByEmail(Mockito.anyString());
        Mockito.verifyNoMoreInteractions(userDaoMock);
    }
}
