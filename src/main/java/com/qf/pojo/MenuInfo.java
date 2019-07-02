package com.qf.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by DELL on 2019/6/4.
 */
@Getter
@Setter
@ToString
public class MenuInfo {
    int menuId;
    String menuName;
    String menu_Url;
    String menuIcon;
    int parentId;

}
