package com.itogge.demo.demospringboot.common;

public class DataResult {
	
	private final static String RESULT_CODE_SUCCESS = "0000";
	private final static String RESULT_CODE_EXCEPTION = "9999";

	private String resultCode;
	
	private String resultMessage;
	
	private Object data;
	
	public DataResult(String resultCode, String resultMessage, Object data) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
		this.data = data;
	}
	
	public static DataResult build(String resultCode, String resultMessage, Object data) {
		return new DataResult(resultCode, resultMessage, data);
	}
	
	
	public static DataResult ok() {
		return DataResult.build(DataResult.RESULT_CODE_SUCCESS, null, null);
	}
	
	public static DataResult ok(Object data) {
		return DataResult.build(DataResult.RESULT_CODE_SUCCESS, null, data);
	}
	
	public static DataResult exception() {
		return DataResult.build(DataResult.RESULT_CODE_EXCEPTION, null, null);
	}
	
	public static DataResult exception(String exceptionMessage) {
		return DataResult.build(DataResult.RESULT_CODE_EXCEPTION, exceptionMessage, null);
	}
	
	public static DataResult exception(Object data) {
		return DataResult.build(DataResult.RESULT_CODE_EXCEPTION, null, data);
	}
	
	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataResult [resultCode=" + resultCode + ", resultMessage=" + resultMessage + ", data=" + data + "]";
	}
}
