/**
 * 
 */
package com.yousef.ytable.form;

import java.util.List;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class GeneralOptions {
	
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
	
	@Override
	public String toString() {
		return "GeneralOptions ["
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
						+ unAuthorizedRequestRedirectUrl
						: "") + "]";
	}
	
	

}
