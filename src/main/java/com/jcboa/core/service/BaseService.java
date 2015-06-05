package com.jcboa.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jcboa.core.pojo.BaseData;
import com.jcboa.core.pojo.PageData;

/**
 * Service 基类接口
 * 
 * @author qizh@jucaibao.com
 *
 * @param <T>
 */
public interface BaseService<T extends BaseData> {

	/**
	 * 保存和更新
	 * 
	 * @param object
	 * @param request
	 * @return
	 * @throws Exception
	 */
	boolean save(T object, HttpServletRequest request) throws Exception;

	/**
	 * 物理删除
	 * 
	 * @param object
	 * @return
	 * @throws Exception
	 */
	boolean delete(T object) throws Exception;

	/**
	 * 逻辑删除
	 * 
	 * @param object
	 * @param request
	 * @return
	 * @throws Exception
	 */
	boolean delete(T object, HttpServletRequest request) throws Exception;

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @throws Exception
	 */
	boolean delete(Integer[] ids) throws Exception;

	/**
	 * 查询全部
	 * 
	 * @param queryObject
	 * @return
	 * @throws Exception
	 */
	List<T> query(T queryObject) throws Exception;

	/**
	 * 根据ID对象查询
	 * 
	 * @param queryObject
	 * @return
	 * @throws Exception
	 */
	T queryById(T queryObject) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param queryObject
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<T> pageQuery(T queryObject, PageData page) throws Exception;

}
