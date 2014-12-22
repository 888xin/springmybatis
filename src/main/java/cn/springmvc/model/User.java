package cn.springmvc.model;

/**
 * Created by lhx on 14-12-22 上午10:22
 *
 * @project springmybatis
 * @package cn.springmvc.model
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description 用户表
 */
public class User {

    private int id;
    private int state;
    private String nickname;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
