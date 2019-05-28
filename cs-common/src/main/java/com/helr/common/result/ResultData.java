package com.helr.common.result;

import java.io.Serializable;

/**
 * 返回数据格式
 * 
 * @version V1.0
 */
public class ResultData implements Serializable {
	private static final long serialVersionUID = -7653031048752066399L;
	/**返回状态码*/
	private Integer code;
	/** 状态码信息*/
	private String result;
	/**返回结果*/
	private Object data;
	/** 总条数 */
	private Integer total;

	public ResultData() {
	}



	public ResultData(Integer code, String result, Object data, Integer total) {
		super();
		this.code = code;
		this.result = result;
		this.data = data;
		this.total = total;
	}

	public ResultData(Integer code, String result, Object data) {
		super();
		this.code = code;
		this.result = result;
		this.data = data;
	}

	public ResultData(Integer code) {
		super();
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}


}
