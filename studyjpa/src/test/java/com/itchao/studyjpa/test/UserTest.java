package com.itchao.studyjpa.test;

import com.itchao.studyjpa.POJO.User;
import com.itchao.studyjpa.StudyjpaApplication;
import com.itchao.studyjpa.dao.UserDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;




@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void Test(){

        User user = userDao.save(User.builder().name("王月娇").email("123@123.com").build());
        Assertions.assertNotNull(user);
        List<User> users = userDao.findAll();
        System.out.println("------------------------------------------");
        System.out.println(users);
        System.out.println("------------------------------------------");
        Assertions.assertNotNull(users);
        /*List<User> users= userRepository.findAll();
        System.out.println(users);
        Assert.assertNotNull(users);*/
    }
}
