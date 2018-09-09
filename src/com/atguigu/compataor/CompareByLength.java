package com.atguigu.compataor;

import java.util.Comparator;

public class CompareByLength implements Comparator<String> {

	public int compare(String str1, String str2) {
		//按照字符串长度排序,由短到长
		int temp = str1.length()-str2.length();
		//长度相等,再按照字符串自然排序
		return temp==0?str1.compareTo(str2):temp;
		
	}

	

}
