package com.jcboa.core.controller;

import org.springframework.web.servlet.ModelAndView;

import com.jcboa.core.pojo.BaseData;
import com.jcboa.core.service.BaseService;

/**
 * 控制器基类
 * 
 * @author qizh@jucaibao.com
 *
 * @param <T>
 * @param <S>
 */
public abstract class BaseController<T extends BaseData, S extends BaseService<T>> {

	protected S baseService;

	protected ModelAndView modelView = new ModelAndView();

	public S getBaseService() {
		return baseService;
	}

	public abstract void setBaseService(S baseService);

}
