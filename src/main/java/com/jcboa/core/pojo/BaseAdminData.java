package com.jcboa.core.pojo;

import com.jcboa.admin.pojo.AdminUserData;

/**
 * 创建者的基类
 * 
 * @author qizh@jucaibao.com
 *
 */
public class BaseAdminData extends BaseData {

	private static final long serialVersionUID = 1L;

	/**
	 * 状态： 1启用 2禁用
	 */
	protected Integer status;

	/**
	 * 创建者
	 */
	protected AdminUserData createAdmin;

	/**
	 * 最后修改者
	 */
	protected AdminUserData lastUpdateAmdin;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public AdminUserData getCreateAdmin() {
		return createAdmin;
	}

	public void setCreateAdmin(AdminUserData createAdmin) {
		this.createAdmin = createAdmin;
	}

	public AdminUserData getLastUpdateAmdin() {
		return lastUpdateAmdin;
	}

	public void setLastUpdateAmdin(AdminUserData lastUpdateAmdin) {
		this.lastUpdateAmdin = lastUpdateAmdin;
	}

}
