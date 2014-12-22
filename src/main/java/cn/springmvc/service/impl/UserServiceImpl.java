package cn.springmvc.service.impl;

import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lhx on 14-12-22 上午10:24
 *
 * @project springmybatis
 * @package cn.springmvc.service.impl
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDAO;

    @Override
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(user);
    }

}
