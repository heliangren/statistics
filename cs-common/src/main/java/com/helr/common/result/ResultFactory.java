package com.helr.common.result;

import org.apache.http.HttpStatus;

/**
 * 返回结果工厂
 * @version V1.0
 */
public class ResultFactory {
	/**
	 * 请求成功
	 */
	public static final Integer SUCCESS = 200;

	/**
	 * 请求失败
	 */
	public static final Integer FAILURE = 400;

	/**
	 * 服务器异常
	 */
	public static final Integer SYSTEM_EXCEPTION = 500;

	/**
	 * 登录失败
	 */
	public static final Integer LOGIN_ERROR = 401;

	/**
	 * 登录失败
	 */
	public static final Integer RANDOM_OVERDUE = 402;

	/**
	 * 服务器异常描述
	 */
	public static final String SYSTEM_EXCEPTION_DESC = "服务器出异常";
	
	private ResultFactory() {
	}

	public static ResultData getSuccessResult() {
		return new ResultData(SUCCESS, null, null);
	}

	public static ResultData getSuccessResult(String result) {
		return new ResultData(SUCCESS, result, null);
	}

	public static ResultData getSuccessResult(Object obj) {
		return new ResultData(SUCCESS, null, obj);
	}

	public static ResultData getSuccessPageResult(Object obj, int total) {
		return new ResultData(SUCCESS, null, obj, total);
	}

	public static ResultData getFailResult() {
		return new ResultData(FAILURE, null, null);
	}

	public static ResultData getFailResult(String result) {
		return new ResultData(FAILURE, result, null);
	}

	public static ResultData getFailResult(Object obj) {
		return new ResultData(FAILURE, null, obj);
	}

	public static ResultData getExceptionResult() {
		return new ResultData(SYSTEM_EXCEPTION,
				SYSTEM_EXCEPTION_DESC, null);
	}

	/**401 请登录账号*/
	public static ResultData getUnauthorized() {
		return new ResultData(HttpStatus.SC_UNAUTHORIZED,
				"请登录账号", null);
	}

}
