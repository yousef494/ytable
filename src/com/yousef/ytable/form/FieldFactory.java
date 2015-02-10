/**
 * 
 */
package com.yousef.ytable.form;

import java.util.List;

import com.google.gson.Gson;

/**
 * @author Yousef AlSuwaidan
 *
 */
public class FieldFactory {
	
	public static String fieldsToJson(List<Field> fields){
		Gson gson = new Gson();
		String fieldJsonString="";
		for(Field field:fields){
			fieldJsonString+=field.getHeader()+":"+gson.toJson(field.getFieldOptions())+",";
		}
		fieldJsonString.substring(0,fieldJsonString.length()-1);
		return fieldJsonString;
	}
	
}
