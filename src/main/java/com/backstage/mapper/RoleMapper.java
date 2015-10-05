package com.backstage.mapper;

import java.util.List;

import com.backstage.entity.RoleFormMap;
import com.backstage.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
