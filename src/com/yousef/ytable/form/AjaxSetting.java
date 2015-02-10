package com.yousef.ytable.form;

import com.google.gson.JsonObject;

public class AjaxSetting {
	
	private String accepts;
	private boolean async;
	private String beforeSend;
	private boolean cache;
	private String complete;
	private JsonObject contents;//plainObject
	private String contentType;
	private JsonObject context;//plainObject
	private JsonObject converts;//plainObject
	private boolean crossDomain;
	private JsonObject data;//plainObject
	private String dataFilter;
	private String dataType;
	private String error;
	private boolean global;
	private Object headers;
	private boolean ifModified;
	private boolean isLocal;
	private String jsonp;
	private String jsonpCallback;
	private String mimeType;
	private String password;
	private boolean processData;
	private String scriptCharset;
	private Object statusCode;
	private String success;
	private Integer timeout;
	private boolean traditional;
	private String type;
	private String url;
	private String username;
	private String xhr;
	private Object xhrFields;
	public String getAccepts() {
		return accepts;
	}
	public void setAccepts(String accepts) {
		this.accepts = accepts;
	}
	public boolean isAsync() {
		return async;
	}
	public void setAsync(boolean async) {
		this.async = async;
	}
	public String getBeforeSend() {
		return beforeSend;
	}
	public void setBeforeSend(String beforeSend) {
		this.beforeSend = beforeSend;
	}
	public boolean isCache() {
		return cache;
	}
	public void setCache(boolean cache) {
		this.cache = cache;
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	public JsonObject getContents() {
		return contents;
	}
	public void setContents(JsonObject contents) {
		this.contents = contents;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public JsonObject getContext() {
		return context;
	}
	public void setContext(JsonObject context) {
		this.context = context;
	}
	public JsonObject getConverts() {
		return converts;
	}
	public void setConverts(JsonObject converts) {
		this.converts = converts;
	}
	public boolean isCrossDomain() {
		return crossDomain;
	}
	public void setCrossDomain(boolean crossDomain) {
		this.crossDomain = crossDomain;
	}
	public JsonObject getData() {
		return data;
	}
	public void setData(JsonObject data) {
		this.data = data;
	}
	public String getDataFilter() {
		return dataFilter;
	}
	public void setDataFilter(String dataFilter) {
		this.dataFilter = dataFilter;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public boolean isGlobal() {
		return global;
	}
	public void setGlobal(boolean global) {
		this.global = global;
	}
	public Object getHeaders() {
		return headers;
	}
	public void setHeaders(Object headers) {
		this.headers = headers;
	}
	public boolean isIfModified() {
		return ifModified;
	}
	public void setIfModified(boolean ifModified) {
		this.ifModified = ifModified;
	}
	public boolean isLocal() {
		return isLocal;
	}
	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}
	public String getJsonp() {
		return jsonp;
	}
	public void setJsonp(String jsonp) {
		this.jsonp = jsonp;
	}
	public String getJsonpCallback() {
		return jsonpCallback;
	}
	public void setJsonpCallback(String jsonpCallback) {
		this.jsonpCallback = jsonpCallback;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isProcessData() {
		return processData;
	}
	public void setProcessData(boolean processData) {
		this.processData = processData;
	}
	public String getScriptCharset() {
		return scriptCharset;
	}
	public void setScriptCharset(String scriptCharset) {
		this.scriptCharset = scriptCharset;
	}
	public Object getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Object statusCode) {
		this.statusCode = statusCode;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public Integer getTimeout() {
		return timeout;
	}
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	public boolean isTraditional() {
		return traditional;
	}
	public void setTraditional(boolean traditional) {
		this.traditional = traditional;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getXhr() {
		return xhr;
	}
	public void setXhr(String xhr) {
		this.xhr = xhr;
	}
	public Object getXhrFields() {
		return xhrFields;
	}
	public void setXhrFields(Object xhrFields) {
		this.xhrFields = xhrFields;
	}
	@Override
	public String toString() {
		return "AjaxSetting ["
				+ (accepts != null ? "accepts=" + accepts + ", " : "")
				+ "async="
				+ async
				+ ", "
				+ (beforeSend != null ? "beforeSend=" + beforeSend + ", " : "")
				+ "cache="
				+ cache
				+ ", "
				+ (complete != null ? "complete=" + complete + ", " : "")
				+ (contents != null ? "contents=" + contents + ", " : "")
				+ (contentType != null ? "contentType=" + contentType + ", "
						: "")
				+ (context != null ? "context=" + context + ", " : "")
				+ (converts != null ? "converts=" + converts + ", " : "")
				+ "crossDomain="
				+ crossDomain
				+ ", "
				+ (data != null ? "data=" + data + ", " : "")
				+ (dataFilter != null ? "dataFilter=" + dataFilter + ", " : "")
				+ (dataType != null ? "dataType=" + dataType + ", " : "")
				+ (error != null ? "error=" + error + ", " : "")
				+ "global="
				+ global
				+ ", "
				+ (headers != null ? "headers=" + headers + ", " : "")
				+ "ifModified="
				+ ifModified
				+ ", isLocal="
				+ isLocal
				+ ", "
				+ (jsonp != null ? "jsonp=" + jsonp + ", " : "")
				+ (jsonpCallback != null ? "jsonpCallback=" + jsonpCallback
						+ ", " : "")
				+ (mimeType != null ? "mimeType=" + mimeType + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ "processData="
				+ processData
				+ ", "
				+ (scriptCharset != null ? "scriptCharset=" + scriptCharset
						+ ", " : "")
				+ (statusCode != null ? "statusCode=" + statusCode + ", " : "")
				+ (success != null ? "success=" + success + ", " : "")
				+ (timeout != null ? "timeout=" + timeout + ", " : "")
				+ "traditional=" + traditional + ", "
				+ (type != null ? "type=" + type + ", " : "")
				+ (url != null ? "url=" + url + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (xhr != null ? "xhr=" + xhr + ", " : "")
				+ (xhrFields != null ? "xhrFields=" + xhrFields : "") + "]";
	}
	
	
	

}
