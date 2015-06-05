package com.jcboa.admin.pojo;

import java.sql.Timestamp;

import com.jcboa.core.pojo.BaseAdminData;

/**
 * 管理员实体
 * 
 * @author qizh@jucaibao.com
 *
 */
public class AdminUserData extends BaseAdminData {

	private static final long serialVersionUID = 1L;

	private String userName; // 用户名

	private String password; // 密码

	private Integer sex; // 性别 1男 2女

	private String lastIp; // 最后登录IP

	private Timestamp lastTime; // 最后登录时间

	private RoleData role; // 角色

	private String realName; // 真实姓名

	private String telephone; // 手机号码

	private String qq; // QQ号码

	private String email; // 邮箱

	private String card; // 身份证号码

	private String remark; // 备注

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Timestamp getLastTime() {
		return lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public RoleData getRole() {
		return role;
	}

	public void setRole(RoleData role) {
		this.role = role;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
