package com.jcboa.core.common.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 异常处理类
 * 
 * @author qizh@jucaibao.com
 *
 */
public class CommonExceptionResolver extends SimpleMappingExceptionResolver
		implements HandlerExceptionResolver {

	private static final Logger LOG = LoggerFactory
			.getLogger(CommonExceptionResolver.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		LOG.error("Error: {}", ex.getMessage());
		return super.getModelAndView("error/500", ex);
	}

}
