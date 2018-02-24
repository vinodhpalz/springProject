package com.vinodh.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckWeekDayInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();
		
		int dow = cal.get(cal.DAY_OF_WEEK);
		
		if(dow == 1)
		{
			response.getWriter().write("The website is closed on Saturday");
			return false;
		}
		return true;
	}

}
