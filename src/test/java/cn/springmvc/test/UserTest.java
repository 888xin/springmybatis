package cn.springmvc.test;

import cn.springmvc.dao.ImageDao;
import cn.springmvc.model.Image;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lhx on 14-12-22 上午10:35
 *
 * @project springmybatis
 * @package cn.springmvc.test
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public class UserTest {

    private UserService userService ;
    private ImageDao imageDao ;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
        imageDao = (ImageDao) context.getBean("imageDao");
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setNickname("你好");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    }

    @Test
    public void addImage(){
        Image image = new Image();
        image.setImageName("美女");
        image.setImagePath("c:\\");
        System.out.println(imageDao.addImage(image));
    }
}
