/**
 * 
 */
package com.yousef.ytable.form;

import java.util.List;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class Form {
	
	//General Options
	private String addRecordButton;
	private AjaxSetting ajaxSettings;
	private boolean animationsEnabled;
	private boolean columnResizable;
	private boolean columnSelectable;
	private String defaultDateFormat;// default: 'yy-mm-dd'
	private String defaultSorting;//none
	private String deleteConfirmation;// boolean or (function)
	private String dialogShowEffect;
	private String dialogHideEffect;
	private String gotoPageArea;
	private boolean jqueryuiTheme;
	private Integer loadingAnimationDelay;
	private Message messages;
	private boolean multiselect;
	private boolean multiSorting;
	private boolean openChildAsAccordion;
	private boolean paging;
	private String pageList;
	private Integer pageSize;
	private List<Integer> pageSizes;
	private boolean pageSizeChangeArea;
	private boolean saveUserPreferences;
	private boolean selecting;
	private boolean selectingCheckboxes;
	private boolean selectOnRowClick;
	private boolean showCloseButton;
	private boolean sorting;
	private String tableId;
	private String title;
	private Toolbar toolbar;//Object
	private String unAuthorizedRequestRedirectUrl;
	//Fields
	private String fields;//{X{},Y{},...}
	//Actions
	private Actions actions;
	//Methods
	private String addRecord;//object
	private String closeChildRow;
	private String closeChildTable;
	private String changeColumnVisibility;
	private String deleteRecord;//object
	private String deleteRows;
	private String destroy;
	private String getChildRow;
	private String getRowByKey;
	private String isChildRowOpen;
	private String load;//object
	private String openChildRow;
	private String openChildTable;
	private String reload;
	private String selectedRows;
	private String selectRows;
	private String showCreateForm;
	private String updateRecord;//object
	//Events
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
	public String getAddRecordButton() {
		return addRecordButton;
	}
	public void setAddRecordButton(String addRecordButton) {
		this.addRecordButton = addRecordButton;
	}
	public AjaxSetting getAjaxSettings() {
		return ajaxSettings;
	}
	public void setAjaxSettings(AjaxSetting ajaxSettings) {
		this.ajaxSettings = ajaxSettings;
	}
	public boolean isAnimationsEnabled() {
		return animationsEnabled;
	}
	public void setAnimationsEnabled(boolean animationsEnabled) {
		this.animationsEnabled = animationsEnabled;
	}
	public boolean isColumnResizable() {
		return columnResizable;
	}
	public void setColumnResizable(boolean columnResizable) {
		this.columnResizable = columnResizable;
	}
	public boolean isColumnSelectable() {
		return columnSelectable;
	}
	public void setColumnSelectable(boolean columnSelectable) {
		this.columnSelectable = columnSelectable;
	}
	public String getDefaultDateFormat() {
		return defaultDateFormat;
	}
	public void setDefaultDateFormat(String defaultDateFormat) {
		this.defaultDateFormat = defaultDateFormat;
	}
	public String getDefaultSorting() {
		return defaultSorting;
	}
	public void setDefaultSorting(String defaultSorting) {
		this.defaultSorting = defaultSorting;
	}
	public String getDeleteConfirmation() {
		return deleteConfirmation;
	}
	public void setDeleteConfirmation(String deleteConfirmation) {
		this.deleteConfirmation = deleteConfirmation;
	}
	public String getDialogShowEffect() {
		return dialogShowEffect;
	}
	public void setDialogShowEffect(String dialogShowEffect) {
		this.dialogShowEffect = dialogShowEffect;
	}
	public String getDialogHideEffect() {
		return dialogHideEffect;
	}
	public void setDialogHideEffect(String dialogHideEffect) {
		this.dialogHideEffect = dialogHideEffect;
	}
	public String getGotoPageArea() {
		return gotoPageArea;
	}
	public void setGotoPageArea(String gotoPageArea) {
		this.gotoPageArea = gotoPageArea;
	}
	public boolean isJqueryuiTheme() {
		return jqueryuiTheme;
	}
	public void setJqueryuiTheme(boolean jqueryuiTheme) {
		this.jqueryuiTheme = jqueryuiTheme;
	}
	public Integer getLoadingAnimationDelay() {
		return loadingAnimationDelay;
	}
	public void setLoadingAnimationDelay(Integer loadingAnimationDelay) {
		this.loadingAnimationDelay = loadingAnimationDelay;
	}
	public Message getMessages() {
		return messages;
	}
	public void setMessages(Message messages) {
		this.messages = messages;
	}
	public boolean isMultiselect() {
		return multiselect;
	}
	public void setMultiselect(boolean multiselect) {
		this.multiselect = multiselect;
	}
	public boolean isMultiSorting() {
		return multiSorting;
	}
	public void setMultiSorting(boolean multiSorting) {
		this.multiSorting = multiSorting;
	}
	public boolean isOpenChildAsAccordion() {
		return openChildAsAccordion;
	}
	public void setOpenChildAsAccordion(boolean openChildAsAccordion) {
		this.openChildAsAccordion = openChildAsAccordion;
	}
	public boolean isPaging() {
		return paging;
	}
	public void setPaging(boolean paging) {
		this.paging = paging;
	}
	public String getPageList() {
		return pageList;
	}
	public void setPageList(String pageList) {
		this.pageList = pageList;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<Integer> getPageSizes() {
		return pageSizes;
	}
	public void setPageSizes(List<Integer> pageSizes) {
		this.pageSizes = pageSizes;
	}
	public boolean isPageSizeChangeArea() {
		return pageSizeChangeArea;
	}
	public void setPageSizeChangeArea(boolean pageSizeChangeArea) {
		this.pageSizeChangeArea = pageSizeChangeArea;
	}
	public boolean isSaveUserPreferences() {
		return saveUserPreferences;
	}
	public void setSaveUserPreferences(boolean saveUserPreferences) {
		this.saveUserPreferences = saveUserPreferences;
	}
	public boolean isSelecting() {
		return selecting;
	}
	public void setSelecting(boolean selecting) {
		this.selecting = selecting;
	}
	public boolean isSelectingCheckboxes() {
		return selectingCheckboxes;
	}
	public void setSelectingCheckboxes(boolean selectingCheckboxes) {
		this.selectingCheckboxes = selectingCheckboxes;
	}
	public boolean isSelectOnRowClick() {
		return selectOnRowClick;
	}
	public void setSelectOnRowClick(boolean selectOnRowClick) {
		this.selectOnRowClick = selectOnRowClick;
	}
	public boolean isShowCloseButton() {
		return showCloseButton;
	}
	public void setShowCloseButton(boolean showCloseButton) {
		this.showCloseButton = showCloseButton;
	}
	public boolean isSorting() {
		return sorting;
	}
	public void setSorting(boolean sorting) {
		this.sorting = sorting;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Toolbar getToolbar() {
		return toolbar;
	}
	public void setToolbar(Toolbar toolbar) {
		this.toolbar = toolbar;
	}
	public String getUnAuthorizedRequestRedirectUrl() {
		return unAuthorizedRequestRedirectUrl;
	}
	public void setUnAuthorizedRequestRedirectUrl(
			String unAuthorizedRequestRedirectUrl) {
		this.unAuthorizedRequestRedirectUrl = unAuthorizedRequestRedirectUrl;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setFieldsFromFactory(List<Field> fields){
		this.fields = FieldFactory.fieldsToJson(fields);
	}
	public Actions getActions() {
		return actions;
	}
	public void setActions(Actions actions) {
		this.actions = actions;
	}
	public String getAddRecord() {
		return addRecord;
	}
	public void setAddRecord(String addRecord) {
		this.addRecord = addRecord;
	}
	public String getCloseChildRow() {
		return closeChildRow;
	}
	public void setCloseChildRow(String closeChildRow) {
		this.closeChildRow = closeChildRow;
	}
	public String getCloseChildTable() {
		return closeChildTable;
	}
	public void setCloseChildTable(String closeChildTable) {
		this.closeChildTable = closeChildTable;
	}
	public String getChangeColumnVisibility() {
		return changeColumnVisibility;
	}
	public void setChangeColumnVisibility(String changeColumnVisibility) {
		this.changeColumnVisibility = changeColumnVisibility;
	}
	public String getDeleteRecord() {
		return deleteRecord;
	}
	public void setDeleteRecord(String deleteRecord) {
		this.deleteRecord = deleteRecord;
	}
	public String getDeleteRows() {
		return deleteRows;
	}
	public void setDeleteRows(String deleteRows) {
		this.deleteRows = deleteRows;
	}
	public String getDestroy() {
		return destroy;
	}
	public void setDestroy(String destroy) {
		this.destroy = destroy;
	}
	public String getGetChildRow() {
		return getChildRow;
	}
	public void setGetChildRow(String getChildRow) {
		this.getChildRow = getChildRow;
	}
	public String getGetRowByKey() {
		return getRowByKey;
	}
	public void setGetRowByKey(String getRowByKey) {
		this.getRowByKey = getRowByKey;
	}
	public String getIsChildRowOpen() {
		return isChildRowOpen;
	}
	public void setIsChildRowOpen(String isChildRowOpen) {
		this.isChildRowOpen = isChildRowOpen;
	}
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	public String getOpenChildRow() {
		return openChildRow;
	}
	public void setOpenChildRow(String openChildRow) {
		this.openChildRow = openChildRow;
	}
	public String getOpenChildTable() {
		return openChildTable;
	}
	public void setOpenChildTable(String openChildTable) {
		this.openChildTable = openChildTable;
	}
	public String getReload() {
		return reload;
	}
	public void setReload(String reload) {
		this.reload = reload;
	}
	public String getSelectedRows() {
		return selectedRows;
	}
	public void setSelectedRows(String selectedRows) {
		this.selectedRows = selectedRows;
	}
	public String getSelectRows() {
		return selectRows;
	}
	public void setSelectRows(String selectRows) {
		this.selectRows = selectRows;
	}
	public String getShowCreateForm() {
		return showCreateForm;
	}
	public void setShowCreateForm(String showCreateForm) {
		this.showCreateForm = showCreateForm;
	}
	public String getUpdateRecord() {
		return updateRecord;
	}
	public void setUpdateRecord(String updateRecord) {
		this.updateRecord = updateRecord;
	}
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
		return "Form ["
				+ (addRecordButton != null ? "addRecordButton="
						+ addRecordButton + ", " : "")
				+ (ajaxSettings != null ? "ajaxSettings=" + ajaxSettings + ", "
						: "")
				+ "animationsEnabled="
				+ animationsEnabled
				+ ", columnResizable="
				+ columnResizable
				+ ", columnSelectable="
				+ columnSelectable
				+ ", "
				+ (defaultDateFormat != null ? "defaultDateFormat="
						+ defaultDateFormat + ", " : "")
				+ (defaultSorting != null ? "defaultSorting=" + defaultSorting
						+ ", " : "")
				+ (deleteConfirmation != null ? "deleteConfirmation="
						+ deleteConfirmation + ", " : "")
				+ (dialogShowEffect != null ? "dialogShowEffect="
						+ dialogShowEffect + ", " : "")
				+ (dialogHideEffect != null ? "dialogHideEffect="
						+ dialogHideEffect + ", " : "")
				+ (gotoPageArea != null ? "gotoPageArea=" + gotoPageArea + ", "
						: "")
				+ "jqueryuiTheme="
				+ jqueryuiTheme
				+ ", "
				+ (loadingAnimationDelay != null ? "loadingAnimationDelay="
						+ loadingAnimationDelay + ", " : "")
				+ (messages != null ? "messages=" + messages + ", " : "")
				+ "multiselect="
				+ multiselect
				+ ", multiSorting="
				+ multiSorting
				+ ", openChildAsAccordion="
				+ openChildAsAccordion
				+ ", paging="
				+ paging
				+ ", "
				+ (pageList != null ? "pageList=" + pageList + ", " : "")
				+ (pageSize != null ? "pageSize=" + pageSize + ", " : "")
				+ (pageSizes != null ? "pageSizes=" + pageSizes + ", " : "")
				+ "pageSizeChangeArea="
				+ pageSizeChangeArea
				+ ", saveUserPreferences="
				+ saveUserPreferences
				+ ", selecting="
				+ selecting
				+ ", selectingCheckboxes="
				+ selectingCheckboxes
				+ ", selectOnRowClick="
				+ selectOnRowClick
				+ ", showCloseButton="
				+ showCloseButton
				+ ", sorting="
				+ sorting
				+ ", "
				+ (tableId != null ? "tableId=" + tableId + ", " : "")
				+ (title != null ? "title=" + title + ", " : "")
				+ (toolbar != null ? "toolbar=" + toolbar + ", " : "")
				+ (unAuthorizedRequestRedirectUrl != null ? "unAuthorizedRequestRedirectUrl="
						+ unAuthorizedRequestRedirectUrl + ", "
						: "")
				+ (fields != null ? "fields=" + fields + ", " : "")
				+ (actions != null ? "actions=" + actions + ", " : "")
				+ (addRecord != null ? "addRecord=" + addRecord + ", " : "")
				+ (closeChildRow != null ? "closeChildRow=" + closeChildRow
						+ ", " : "")
				+ (closeChildTable != null ? "closeChildTable="
						+ closeChildTable + ", " : "")
				+ (changeColumnVisibility != null ? "changeColumnVisibility="
						+ changeColumnVisibility + ", " : "")
				+ (deleteRecord != null ? "deleteRecord=" + deleteRecord + ", "
						: "")
				+ (deleteRows != null ? "deleteRows=" + deleteRows + ", " : "")
				+ (destroy != null ? "destroy=" + destroy + ", " : "")
				+ (getChildRow != null ? "getChildRow=" + getChildRow + ", "
						: "")
				+ (getRowByKey != null ? "getRowByKey=" + getRowByKey + ", "
						: "")
				+ (isChildRowOpen != null ? "isChildRowOpen=" + isChildRowOpen
						+ ", " : "")
				+ (load != null ? "load=" + load + ", " : "")
				+ (openChildRow != null ? "openChildRow=" + openChildRow + ", "
						: "")
				+ (openChildTable != null ? "openChildTable=" + openChildTable
						+ ", " : "")
				+ (reload != null ? "reload=" + reload + ", " : "")
				+ (selectedRows != null ? "selectedRows=" + selectedRows + ", "
						: "")
				+ (selectRows != null ? "selectRows=" + selectRows + ", " : "")
				+ (showCreateForm != null ? "showCreateForm=" + showCreateForm
						+ ", " : "")
				+ (updateRecord != null ? "updateRecord=" + updateRecord + ", "
						: "")
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
