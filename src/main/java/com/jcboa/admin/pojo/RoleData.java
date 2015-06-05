package com.jcboa.admin.pojo;

import com.jcboa.core.pojo.BaseAdminData;

/**
 * 角色实体
 * 
 * @author qizh@jucaibao.com
 *
 */
public class RoleData extends BaseAdminData {

	private static final long serialVersionUID = 1L;

	private String name; // 名称

	private String description; // 描述

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
