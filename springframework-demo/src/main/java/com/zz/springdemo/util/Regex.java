package com.zz.springdemo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	// 首字母汉字
	public static final String CHINESE = "^[\u4e00-\u9fa5]";
	// 英文字母开头,数字结尾
	public static final String FIRST_EN_END_CN = "^[A-Za-z]+[0-9]+$";
	// 所有字母是英文
	public static final String ALL_EN = "^[A-Za-z]+$";
	// 数字规则
	public static final String NUMBER = "[0-9]+";
	// 用于定义分区字母匹配
	public static final String PARTITION = "^[a-z0-9]";

	// 用于首字符是字母或数字
	public static final String FIRST_IS_WORD_OR_NUM = "^[A-Za-z0-9]";

	// 用于首字符是字母或数字
	public static final String END_IS_WORD_OR_NUM = "[A-Za-z0-9]$";

	// 定义首字母为大写字母
	public static final String BIG_WORD = "[A-Z]";
	// 英文开头可以包含空格
	public static final String EN_NAME = "^[A-Za-z\\s]+$";

	// 验证是否含有^%&',;=?$\"等字符："[^%&',;=?$\x22]+"
	public static final String SPEC_CHAR ="[`~!#$%^&*()+=|{}':;',//[//]<>/?~！#￥%……&*（）——+|{}【】‘；：”“’。，、？]+";

	// 验证文件路径是否为绝对路径
	public static final String ABSOLUTE_FILE_PATH  = "^\\w:";

	// 验证文件名是否有后缀名
	public static final String FILE_SUFFIX = "\\.\\w+$";
	
	public final static String BEGIN_NUM = "^[\\d][\\d\\D]*";
	public final static String EXPLORER = "[\\d\\D]*";

	/* 根据String与匹配规则,判断是否成立 */
	public static boolean isMatch(String str, String reg) {
		if (Validate.isEmpty(str)) {
			return false;
		}
		Pattern pat = Pattern.compile(reg);
		Matcher mat = pat.matcher(str.trim());
		return mat.find();
	}

	/**
	 * 提取字符串中 与正则表达示匹配的内容
	 * @param content
	 * @param regex
	 * @return 提取的内容以 $ 分隔
	 */
	public static String findRegex(String content, String regex) {
		String str = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			str += "$" + matcher.group(0);
		}
		if(!Validate.isEmpty(str)){
			str = str.substring(1);
		}
		return str;
	}
	
	/**
	 * 统计 字符串中 包含正则表达示匹配的元素个数
	 * @param content
	 * @param regex
	 * @return 个数
	 */
	public static int countRegex(String content,String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		int count = 0;
		while(matcher.find()){
			count ++;
		}
		return count;
	}
	
	/**
	 * 
	 * @param content
	 * @param regex
	 * @return 第一次匹配的位置索引号
	 */
	public static int firstMatchIndex(String content,String regex){
		int index = 0;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		String str = null;
		while(matcher.find()){
			str = matcher.group(0);
			break;
		}
		if(!Validate.isEmpty(str)){
			index = content.indexOf(str);
		}
		return index;
	}
	
}
