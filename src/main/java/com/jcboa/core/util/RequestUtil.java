package com.jcboa.core.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求工具类
 * 
 * @author qizh@jucaibao.com
 *
 */
public final class RequestUtil {

	/**
	 * 获取客户端真实IP
	 * 
	 * @param request
	 * @return
	 */
	public static String getRemoteAddress(HttpServletRequest request) {

		if (null != request) {
			String ip = request.getHeader("X-Forwarded-For");
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_CLIENT_IP");
			}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}

			return ip;
		}

		return null;
	}
}
