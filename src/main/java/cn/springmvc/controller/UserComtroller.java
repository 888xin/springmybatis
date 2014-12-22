package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lhx on 14-12-22 下午3:08
 *
 * @project springmybatis
 * @package cn.springmvc.controller
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
@Controller
@RequestMapping("/")
public class UserComtroller {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
