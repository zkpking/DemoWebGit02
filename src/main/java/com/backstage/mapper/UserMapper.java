package com.backstage.mapper;

import java.util.List;

import com.backstage.entity.UserFormMap;
import com.backstage.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
