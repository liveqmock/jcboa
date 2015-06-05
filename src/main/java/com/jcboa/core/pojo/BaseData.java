package com.jcboa.core.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基础数据模型，所有实体（除关系实体外）均需要继承该类
 * 
 * @author qizh@jucaibao.com
 *
 */
public class BaseData implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID: 系统自动增长
	 */
	protected Integer id;

	/**
	 * 创建时间
	 */
	protected Timestamp createTime;

	/**
	 * 创建时的IP地址
	 */
	protected String createIp;

	/**
	 * 最后修改时间
	 */
	protected Timestamp lastUpdateTime;

	/**
	 * 最后修改的IP地址
	 */
	protected String lastUpdateIp;

	/**
	 * 删除状态，默认值为1: 1=正常、0=已删除
	 */
	protected Integer deleteState = 1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCreateIp() {
		return createIp;
	}

	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}

	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getLastUpdateIp() {
		return lastUpdateIp;
	}

	public void setLastUpdateIp(String lastUpdateIp) {
		this.lastUpdateIp = lastUpdateIp;
	}

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}

}
