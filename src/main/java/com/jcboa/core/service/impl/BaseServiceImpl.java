package com.jcboa.core.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jcboa.core.dao.BaseDao;
import com.jcboa.core.pojo.BaseData;
import com.jcboa.core.pojo.PageData;
import com.jcboa.core.service.BaseService;
import com.jcboa.core.util.RequestUtil;

/**
 * Service 基类
 * 
 * @author qizh@jucaibao.com
 *
 * @param <T>
 * @param <D>
 */
public abstract class BaseServiceImpl<T extends BaseData, D extends BaseDao<T>>
		implements BaseService<T> {

	protected D baseDao;

	public D getBaseDao() {
		return baseDao;
	}

	public abstract void setBaseDao(D baseDao);

	@Override
	public boolean save(T object, HttpServletRequest request) throws Exception {

		if (object.getId() != null && object.getId() != 0) {
			object.setLastUpdateTime(new Timestamp(System.currentTimeMillis()));
			object.setLastUpdateIp(RequestUtil.getRemoteAddress(request));
			return baseDao.update(object) > 0;
		} else {
			object.setCreateTime(new Timestamp(System.currentTimeMillis()));
			object.setLastUpdateTime(new Timestamp(System.currentTimeMillis()));
			object.setCreateIp(RequestUtil.getRemoteAddress(request));
			object.setLastUpdateIp(RequestUtil.getRemoteAddress(request));
			return baseDao.insert(object) > 0;
		}
	}

	@Override
	public boolean delete(T object) throws Exception {
		return baseDao.delete(object) > 0;
	}

	@Override
	public boolean delete(T object, HttpServletRequest request)
			throws Exception {
		object.setDeleteState(0);
		object.setLastUpdateTime(new Timestamp(System.currentTimeMillis()));
		object.setLastUpdateIp(RequestUtil.getRemoteAddress(request));
		return baseDao.update(object) > 0;
	}

	@Override
	public boolean delete(Integer[] ids) throws Exception {
		return baseDao.batchDelete(ids) > 0;
	}

	@Override
	public List<T> query(T queryObject) throws Exception {
		return baseDao.query(queryObject);
	}

	@Override
	public T queryById(T queryObject) throws Exception {
		return baseDao.queryById(queryObject);
	}

	@Override
	public List<T> pageQuery(T queryObject, PageData page) throws Exception {
		return baseDao.pageQuery(queryObject, page);
	}

}
