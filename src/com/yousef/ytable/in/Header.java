/**
 * 
 */
package com.yousef.ytable.in;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Header {
	
	private String requestType;
	private Integer jtStartIndex;
	private Integer jtPageSize;
	private Integer ytEndIndex;
	private String jtSorting;
	private Object data;
	private Object dependentValue;
	private Object dependsonValue;
	
	
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public Integer getJtStartIndex() {
		return jtStartIndex;
	}
	public void setJtStartIndex(Integer jtStartIndex) {
		this.jtStartIndex = jtStartIndex;
	}
	public Integer getJtPageSize() {
		return jtPageSize;
	}
	public void setJtPageSize(Integer jtPageSize) {
		this.jtPageSize = jtPageSize;
	}
	public Integer getYtEndIndex() {
		return ytEndIndex;
	}
	public void setYtEndIndex(Integer ytEndIndex) {
		this.ytEndIndex = ytEndIndex;
	}
	public String getJtSorting() {
		return jtSorting;
	}
	public void setJtSorting(String jtSorting) {
		this.jtSorting = jtSorting;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getDependentValue() {
		return dependentValue;
	}
	public void setDependentValue(Object dependentValue) {
		this.dependentValue = dependentValue;
	}
	public Object getDependsonValue() {
		return dependsonValue;
	}
	public void setDependsonValue(Object dependsonValue) {
		this.dependsonValue = dependsonValue;
	}
	@Override
	public String toString() {
		return "Header ["
				+ (requestType != null ? "requestType=" + requestType + ", "
						: "")
				+ (jtStartIndex != null ? "jtStartIndex=" + jtStartIndex + ", "
						: "")
				+ (jtPageSize != null ? "jtPageSize=" + jtPageSize + ", " : "")
				+ (ytEndIndex != null ? "ytEndIndex=" + ytEndIndex + ", " : "")
				+ (jtSorting != null ? "jtSorting=" + jtSorting + ", " : "")
				+ (data != null ? "data=" + data + ", " : "")
				+ (dependentValue != null ? "dependentValue=" + dependentValue
						+ ", " : "")
				+ (dependsonValue != null ? "dependsonValue=" + dependsonValue
						: "") + "]";
	}

	
	

}
