package com.qf.service;

import com.qf.dto.MenuInfoDto;
import com.qf.pojo.MenuInfo;

import java.util.List;

/**
 * Created by DELL on 2019/5/21.
 */
public interface MenuInfoService {

    public List<MenuInfoDto> listMenu(int roleId);


    public List<MenuInfoDto> listMenuByUserId(int userId);


    public List<MenuInfo> listAllMenu(MenuInfo menuInfo);
}
