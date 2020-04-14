package com.maven.service.imp;

import com.maven.model.User;
import com.maven.service.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-04-14 17:00
 */
//@RunWith(SpringRunner.class)
//@Transactional
//@Rollback(true)
// 引入 spring-test.jar
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserServiceImplTest {
    @Resource
    IUserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void queryUserPage() {
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        //IUserService service = (UserServiceImpl)ctx.getBean("userService");
        //System.out.println(service.getClass());
        userService.queryUserPage(new HashMap<>());
        System.out.println("##################");

        //ctx.destroy();
    }
}
