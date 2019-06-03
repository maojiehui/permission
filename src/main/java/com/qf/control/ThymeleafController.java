package com.qf.control;

import com.qf.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by DELL on 2019/5/28.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("testOne")
    public ModelAndView testOne(ModelAndView map, HttpSession session){
//        map.addAttribute("val","黄铁峰厕所怒拍小黄瓜");
        //request.setAttribute("val","黄铁峰厕所怒拍小龙虾");

        //1.ModelAndView必须设置viewName（往哪跳）
        map.setViewName("thytest");
        //3.ModelAndView如何存值？
        map.getModelMap().put("val","黄铁峰厕所怒拍小黄鸭");
        map.addObject("val1","黄铁峰厕所怒拍小便池");
        map.addObject("idVal","123");
        map.addObject("utextVal","<b><i>今天天气挺闷的</i></b>");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("邬杰");
        userInfo.setPassword("233333");

        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserName("郑祁峰");
        userInfo1.setPassword("233333");


        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUserName("白猛");
        userInfo2.setPassword("233333");


        UserInfo userInfo3 = new UserInfo();
        userInfo3.setUserName("王应虎");
        userInfo3.setPassword("233333");

        map.addObject("objVal",userInfo);
        session.setAttribute("objVal",userInfo);


        map.addObject("number",11);
        map.addObject("money",100000000);
//        return "thytest";
        //2.如果使用ModelAndView则必须返回其对象


        map.addObject("role","superadmin");

        List<UserInfo> userInfoList = new ArrayList<UserInfo>();

        userInfoList.add(userInfo);
        userInfoList.add(userInfo1);
        userInfoList.add(userInfo2);
        userInfoList.add(userInfo3);
        map.addObject("userList",userInfoList);

        return map;
    }
}
