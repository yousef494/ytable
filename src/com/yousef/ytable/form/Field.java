/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Field {
	
	private String header;
	private FieldOptions fieldOptions;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public FieldOptions getFieldOptions() {
		return fieldOptions;
	}
	public void setFieldOptions(FieldOptions fieldOptions) {
		this.fieldOptions = fieldOptions;
	}
	@Override
	public String toString() {
		return "Field [" + (header != null ? "header=" + header + ", " : "")
				+ (fieldOptions != null ? "fieldOptions=" + fieldOptions : "")
				+ "]";
	}
	
	
	

}
