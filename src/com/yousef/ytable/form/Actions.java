/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Actions {
	
	private String controller;
	private String requestParm;
	private String listAction;
	private String createAction;
	private String updateAction;
	private String deleteAction;
	
	public Actions() {
		super();
		this.requestParm = "requestType";
		// TODO Auto-generated constructor stub
	}

	public Actions(String controller) {
		super();
		this.controller = controller;
		this.requestParm = "requestType";
		this.listAction = controller+"?"+requestParm+"=load";
		this.createAction = controller+"?"+requestParm+"=add";
		this.updateAction = controller+"?"+requestParm+"=update";
		this.deleteAction = controller+"?"+requestParm+"=delete";
	}

	public Actions(String controller, String requestParm) {
		super();
		this.controller = controller;
		this.requestParm = requestParm;
		this.listAction = controller+"?"+requestParm+"=load";
		this.createAction = controller+"?"+requestParm+"=add";
		this.updateAction = controller+"?"+requestParm+"=update";
		this.deleteAction = controller+"?"+requestParm+"=delete";
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
		this.listAction = controller+"?"+requestParm+"=load";
		this.createAction = controller+"?"+requestParm+"=add";
		this.updateAction = controller+"?"+requestParm+"=update";
		this.deleteAction = controller+"?"+requestParm+"=delete";
	}

	public String getRequestParm() {
		return requestParm;
	}

	public void setRequestParm(String requestParm) {
		this.requestParm = requestParm;
	}

	public String getListAction() {
		return listAction;
	}

	public void setListAction(String listAction) {
		this.listAction = listAction;
	}

	public String getCreateAction() {
		return createAction;
	}

	public void setCreateAction(String createAction) {
		this.createAction = createAction;
	}

	public String getUpdateAction() {
		return updateAction;
	}

	public void setUpdateAction(String updateAction) {
		this.updateAction = updateAction;
	}

	public String getDeleteAction() {
		return deleteAction;
	}

	public void setDeleteAction(String deleteAction) {
		this.deleteAction = deleteAction;
	}

	@Override
	public String toString() {
		return "Actions ["
				+ (controller != null ? "controller=" + controller + ", " : "")
				+ (requestParm != null ? "requestParm=" + requestParm + ", "
						: "")
				+ (listAction != null ? "listAction=" + listAction + ", " : "")
				+ (createAction != null ? "createAction=" + createAction + ", "
						: "")
				+ (updateAction != null ? "updateAction=" + updateAction + ", "
						: "")
				+ (deleteAction != null ? "deleteAction=" + deleteAction : "")
				+ "]";
	}
	

}
