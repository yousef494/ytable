/**
 * 
 */
package com.yousef.ytable.form;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Events {
	private String closeRequested;
	private String formClosed;
	private String formCreated;
	private String formSubmitting;
	private String loadingRecords;
	private String recordAdded;
	private String recordDeleted;
	private String recordsLoaded;
	private String recordUpdated;
	private String rowInserted;
	private String rowsRemoved;
	private String rowUpdated;
	private String selectionChanged;
	public String getCloseRequested() {
		return closeRequested;
	}
	public void setCloseRequested(String closeRequested) {
		this.closeRequested = closeRequested;
	}
	public String getFormClosed() {
		return formClosed;
	}
	public void setFormClosed(String formClosed) {
		this.formClosed = formClosed;
	}
	public String getFormCreated() {
		return formCreated;
	}
	public void setFormCreated(String formCreated) {
		this.formCreated = formCreated;
	}
	public String getFormSubmitting() {
		return formSubmitting;
	}
	public void setFormSubmitting(String formSubmitting) {
		this.formSubmitting = formSubmitting;
	}
	public String getLoadingRecords() {
		return loadingRecords;
	}
	public void setLoadingRecords(String loadingRecords) {
		this.loadingRecords = loadingRecords;
	}
	public String getRecordAdded() {
		return recordAdded;
	}
	public void setRecordAdded(String recordAdded) {
		this.recordAdded = recordAdded;
	}
	public String getRecordDeleted() {
		return recordDeleted;
	}
	public void setRecordDeleted(String recordDeleted) {
		this.recordDeleted = recordDeleted;
	}
	public String getRecordsLoaded() {
		return recordsLoaded;
	}
	public void setRecordsLoaded(String recordsLoaded) {
		this.recordsLoaded = recordsLoaded;
	}
	public String getRecordUpdated() {
		return recordUpdated;
	}
	public void setRecordUpdated(String recordUpdated) {
		this.recordUpdated = recordUpdated;
	}
	public String getRowInserted() {
		return rowInserted;
	}
	public void setRowInserted(String rowInserted) {
		this.rowInserted = rowInserted;
	}
	public String getRowsRemoved() {
		return rowsRemoved;
	}
	public void setRowsRemoved(String rowsRemoved) {
		this.rowsRemoved = rowsRemoved;
	}
	public String getRowUpdated() {
		return rowUpdated;
	}
	public void setRowUpdated(String rowUpdated) {
		this.rowUpdated = rowUpdated;
	}
	public String getSelectionChanged() {
		return selectionChanged;
	}
	public void setSelectionChanged(String selectionChanged) {
		this.selectionChanged = selectionChanged;
	}
	@Override
	public String toString() {
		return "Events ["
				+ (closeRequested != null ? "closeRequested=" + closeRequested
						+ ", " : "")
				+ (formClosed != null ? "formClosed=" + formClosed + ", " : "")
				+ (formCreated != null ? "formCreated=" + formCreated + ", "
						: "")
				+ (formSubmitting != null ? "formSubmitting=" + formSubmitting
						+ ", " : "")
				+ (loadingRecords != null ? "loadingRecords=" + loadingRecords
						+ ", " : "")
				+ (recordAdded != null ? "recordAdded=" + recordAdded + ", "
						: "")
				+ (recordDeleted != null ? "recordDeleted=" + recordDeleted
						+ ", " : "")
				+ (recordsLoaded != null ? "recordsLoaded=" + recordsLoaded
						+ ", " : "")
				+ (recordUpdated != null ? "recordUpdated=" + recordUpdated
						+ ", " : "")
				+ (rowInserted != null ? "rowInserted=" + rowInserted + ", "
						: "")
				+ (rowsRemoved != null ? "rowsRemoved=" + rowsRemoved + ", "
						: "")
				+ (rowUpdated != null ? "rowUpdated=" + rowUpdated + ", " : "")
				+ (selectionChanged != null ? "selectionChanged="
						+ selectionChanged : "") + "]";
	}
	
	

}
