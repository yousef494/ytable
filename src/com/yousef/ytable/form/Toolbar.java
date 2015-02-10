/**
 * 
 */
package com.yousef.ytable.form;

import java.util.List;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Toolbar {
	
	private boolean hoverAnimation;
	private Integer hoverAnimationDuration;
	private String hoverAnimationEasing;
	private List<Item> items;
	
	public boolean isHoverAnimation() {
		return hoverAnimation;
	}
	public void setHoverAnimation(boolean hoverAnimation) {
		this.hoverAnimation = hoverAnimation;
	}
	public Integer getHoverAnimationDuration() {
		return hoverAnimationDuration;
	}
	public void setHoverAnimationDuration(Integer hoverAnimationDuration) {
		this.hoverAnimationDuration = hoverAnimationDuration;
	}
	public String getHoverAnimationEasing() {
		return hoverAnimationEasing;
	}
	public void setHoverAnimationEasing(String hoverAnimationEasing) {
		this.hoverAnimationEasing = hoverAnimationEasing;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
