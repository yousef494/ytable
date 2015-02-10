/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Item {
	
	private String icon;
	private String text;
	private String click;
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getClick() {
		return click;
	}
	public void setClick(String click) {
		this.click = click;
	}
	
	@Override
	public String toString() {
		return "Item [" + (icon != null ? "icon=" + icon + ", " : "")
				+ (text != null ? "text=" + text + ", " : "")
				+ (click != null ? "click=" + click : "") + "]";
	}
	
	

}
