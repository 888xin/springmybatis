package cn.springmvc.dao;

import cn.springmvc.model.User;

/**
 * Created by lhx on 14-12-22 上午10:23
 *
 * @project springmybatis
 * @package cn.springmvc.dao
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public interface UserDao {
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
