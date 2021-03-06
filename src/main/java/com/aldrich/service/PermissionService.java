package com.aldrich.service;

import com.aldrich.model.Permission;

import java.util.List;
import java.util.Map;

/**
 * @author aldrich
 * @date 2019/1/2 22:01
 */
public interface PermissionService {

    /**
     * 获取所有的角色信息
     * @return list
     **/
    List<Permission> selectPermission();

    /**
     * 获取所有的角色记录
     * @return int
     **/
    int  permissionTotal();


    /**
     * 获取分页的的角色信息
     * @param map
     * @return list
     **/
    List<Permission> limitPermission(Map map);


    /**
     * 获取所有的管理员角色详细信息
     * @return list
     **/
    List<Permission> selectPermissions();


    /**
     * 获取所有的管理员角色记录
     * @return int
     **/
    int permissionTotals();

    /**
     * 获取分页的的管理员角色信息
     * @param map
     * @return list
     **/
    List<Permission> limitPermissions(Map map);

}
