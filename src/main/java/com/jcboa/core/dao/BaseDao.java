package com.jcboa.core.dao;

import java.util.List;

import com.jcboa.core.pojo.PageData;

/**
 * BaseDao
 * 
 * @author qizh@jucaibao.com
 *
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 插入数据
	 * 
	 * @param object
	 * @return
	 * @throws Exception
	 */
	Integer insert(T object) throws Exception;

	/**
	 * 查询全部
	 * 
	 * @param queryObject
	 * @return
	 * @throws Exception
	 */
	List<T> query(T queryObject) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param queryObject
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<T> pageQuery(T queryObject, PageData page) throws Exception;

	/**
	 * 物理删除数据
	 * 
	 * @param object
	 * @throws Exception
	 */
	Integer delete(T object) throws Exception;

	/**
	 * 修改数据
	 * 
	 * @param object
	 * @throws Exception
	 */
	Integer update(T object) throws Exception;

	/**
	 * 根据ID查询
	 * 
	 * @param queryObject
	 * @return
	 * @throws Exception
	 */
	T queryById(T queryObject) throws Exception;

	/**
	 * 批量逻辑删除
	 */
	Integer batchDelete(Integer[] ids) throws Exception;

}
