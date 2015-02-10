/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class FieldOptions {
	private boolean columnResizable;
	private boolean create;
	private boolean edit;
	private String defaultValue;
	private String dependsOn;
	private String display;
	private String input;
	private String inputClass;
	private String inputTitle;
	private boolean key;
	private boolean list;
	private String listClass;
	private Object options;
	private String optionsSorting;
	private boolean sorting;
	private String title;
	private String type;
	private String visibility;
	private String width;
	
	public boolean isColumnResizable() {
		return columnResizable;
	}
	public void setColumnResizable(boolean columnResizable) {
		this.columnResizable = columnResizable;
	}
	public boolean isCreate() {
		return create;
	}
	public void setCreate(boolean create) {
		this.create = create;
	}
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getDependsOn() {
		return dependsOn;
	}
	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getInputClass() {
		return inputClass;
	}
	public void setInputClass(String inputClass) {
		this.inputClass = inputClass;
	}
	public String getInputTitle() {
		return inputTitle;
	}
	public void setInputTitle(String inputTitle) {
		this.inputTitle = inputTitle;
	}
	public boolean isKey() {
		return key;
	}
	public void setKey(boolean key) {
		this.key = key;
	}
	public boolean isList() {
		return list;
	}
	public void setList(boolean list) {
		this.list = list;
	}
	public String getListClass() {
		return listClass;
	}
	public void setListClass(String listClass) {
		this.listClass = listClass;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object options) {
		this.options = options;
	}
	public String getOptionsSorting() {
		return optionsSorting;
	}
	public void setOptionsSorting(String optionsSorting) {
		this.optionsSorting = optionsSorting;
	}
	public boolean isSorting() {
		return sorting;
	}
	public void setSorting(boolean sorting) {
		this.sorting = sorting;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "FieldOptions [columnResizable="
				+ columnResizable
				+ ", create="
				+ create
				+ ", edit="
				+ edit
				+ ", "
				+ (defaultValue != null ? "defaultValue=" + defaultValue + ", "
						: "")
				+ (dependsOn != null ? "dependsOn=" + dependsOn + ", " : "")
				+ (display != null ? "display=" + display + ", " : "")
				+ (input != null ? "input=" + input + ", " : "")
				+ (inputClass != null ? "inputClass=" + inputClass + ", " : "")
				+ (inputTitle != null ? "inputTitle=" + inputTitle + ", " : "")
				+ "key="
				+ key
				+ ", list="
				+ list
				+ ", "
				+ (listClass != null ? "listClass=" + listClass + ", " : "")
				+ (options != null ? "options=" + options + ", " : "")
				+ (optionsSorting != null ? "optionsSorting=" + optionsSorting
						+ ", " : "") + "sorting=" + sorting + ", "
				+ (title != null ? "title=" + title + ", " : "")
				+ (type != null ? "type=" + type + ", " : "")
				+ (visibility != null ? "visibility=" + visibility + ", " : "")
				+ (width != null ? "width=" + width : "") + "]";
	}
	
	

}
