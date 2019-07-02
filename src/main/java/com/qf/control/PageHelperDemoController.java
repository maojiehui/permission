package com.qf.control;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.MenuInfoService;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 2019/6/4.
 */
@Controller
public class PageHelperDemoController {
    @Autowired
    private UserInfoService pageService;

    @Autowired
    private MenuInfoService menuInfoService;

    /**
     * 分页查询
     */
    @ResponseBody
    @RequestMapping(value="/list",method= RequestMethod.GET)
    public Object pageList(@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo){
        Integer pageSize=4;//每页显示记录数
        //分页查询
        //PageHelper:mybatis分页查询插件工具类
        PageHelper.startPage(pageNo, pageSize);
        List<UserInfo> userList = pageService.listAllUserInfo();//获取所有用户信息
        //创建页面对象，存放UserInfo泛型的对象。将userList存放进去。
        PageInfo<UserInfo> pageInfo=new PageInfo<UserInfo>(userList);
        return pageInfo;
    }


    @ResponseBody
    @RequestMapping(value = "splitPageMenuInfoList",method = RequestMethod.GET)
    public Object splitPageMenuInfoList(@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,@RequestParam(defaultValue="1",required=true,value="pageSize") Integer pageSize){

        //分页查询
        //PageHelper:mybatis分页查询插件工具类
        PageHelper.startPage(pageNo, pageSize);
        MenuInfo menuInfo = new MenuInfo();

        List<MenuInfo> menuInfoList = menuInfoService.listAllMenu(menuInfo);

        PageInfo<MenuInfo> pageInfo = new PageInfo<MenuInfo>(menuInfoList);
        return pageInfo;
    }
}
