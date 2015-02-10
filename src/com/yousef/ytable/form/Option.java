/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Option {
	
	private String DisplayText;
	private String Value;
	
	
	public Option() {
		super();
	}
	
	public Option(String option) {
		super();
		DisplayText = option;
		Value = option;
	}

	public Option(String displayText, String value) {
		super();
		DisplayText = displayText;
		Value = value;
	}
	
	public String getDisplayText() {
		return DisplayText;
	}
	public void setDisplayText(String displayText) {
		DisplayText = displayText;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	
	@Override
	public String toString() {
		return "Options ["
				+ (DisplayText != null ? "DisplayText=" + DisplayText + ", "
						: "") + (Value != null ? "Value=" + Value : "") + "]";
	}
	
	

}
