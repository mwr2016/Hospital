package com.hospital.dao;

import com.hospital.entity.Login;

import java.util.List;

public interface LoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
    List<Login> findAllAdmin();
}