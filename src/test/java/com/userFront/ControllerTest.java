package com.userFront;

import com.userFront.dao.UserDao;
import com.userFront.domain.User;
import net.bytebuddy.build.EntryPoint;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * test for controller
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EntryPoint.class)
@WebAppConfiguration

public class ControllerTest {
    private static final long USER_ONE_ID = 1L;
    private static final long USER_TWO_ID = 2L;

   /* private MockMvc mockMvc;
    @SuppressWarnings("rawtypes")
    private HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private UserDao userDao;

    @Autowired*/

}
