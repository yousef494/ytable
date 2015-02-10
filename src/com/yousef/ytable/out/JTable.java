/**
 * 
 */
package com.yousef.ytable.out;

import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.*;

import com.yousef.ytable.form.Option;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class JTable {
	
	private String Result;
	private Object Record;
	private List<Object> Records;
	private Integer TotalRecordCount;
	private String Message;
	private boolean UnAuthorizedRequest;
	private List<Option> options;
	
	
	
	public JTable(String result, Object record) {
		super();
		Result = result;
		Record = record;
	}
	
	
	
	public JTable(String result, List<Object> records) {
		super();
		Result = result;
		Records = records;
	}
	
	


	public JTable(String result, List<Object> records, Integer totalRecordCount) {
		super();
		Result = result;
		Records = records;
		TotalRecordCount = totalRecordCount;
	}



	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public Object getRecord() {
		return Record;
	}
	public void setRecord(Object record) {
		Record = record;
	}
	public List<Object> getRecords() {
		return Records;
	}
	public void setRecords(List<Object> records) {
		Records = records;
	}
	public Integer getTotalRecordCount() {
		return TotalRecordCount;
	}
	public void setTotalRecordCount(Integer totalRecordCount) {
		TotalRecordCount = totalRecordCount;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public boolean isUnAuthorizedRequest() {
		return UnAuthorizedRequest;
	}
	public void setUnAuthorizedRequest(boolean unAuthorizedRequest) {
		UnAuthorizedRequest = unAuthorizedRequest;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "JTable ["
				+ (Result != null ? "Result=" + Result + ", " : "")
				+ (Record != null ? "Record=" + Record + ", " : "")
				+ (Records != null ? "Records=" + Records + ", " : "")
				+ (TotalRecordCount != null ? "TotalRecordCount="
						+ TotalRecordCount + ", " : "")
				+ (Message != null ? "Message=" + Message + ", " : "")
				+ "UnAuthorizedRequest=" + UnAuthorizedRequest + ", "
				+ (options != null ? "options=" + options : "") + "]";
	}
	
	

}
