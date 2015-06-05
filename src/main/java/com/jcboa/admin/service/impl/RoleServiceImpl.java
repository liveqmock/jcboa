package com.jcboa.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jcboa.admin.dao.RoleDao;
import com.jcboa.admin.pojo.RoleData;
import com.jcboa.admin.service.RoleService;
import com.jcboa.core.service.impl.BaseServiceImpl;

/**
 * 角色管理
 * 
 * @author qizh@jucaibao.com
 *
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleData, RoleDao>
		implements RoleService {

	@Resource
	public void setBaseDao(RoleDao baseDao) {
		this.baseDao = baseDao;
	}

}
