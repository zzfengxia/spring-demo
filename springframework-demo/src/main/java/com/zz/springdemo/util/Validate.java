package com.zz.springdemo.util;

import java.util.Collection;
import java.util.Map;

public class Validate {
	public static boolean isEmpty(String str) {
		return str == null || (str.trim() == "") || (str.trim() == "null"); 
	}
	public static boolean isEmpty(Collection<?> collection){
		return collection==null || collection.size() == 0;
	}
	public static boolean isEmpty(Map<?,?> map){
		return map == null || map.isEmpty();
	}
	public static boolean isEmpty(Object [] array){
		return array==null || array.length == 0;
	}
}
