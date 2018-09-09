package com.atguigu.collections;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import com.atguigu.compataor.CompareByLength;


public class TestDemo {

	@Test
	public void test(){
		//按照字符串自然顺序排序
		ArrayList<String> list = new ArrayList<String>();
		list.add("fhf");
		list.add("asd");
		list.add("grtfgh");
		list.add("edfg");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	@Test
	public void test2(){
		//按照字符串长度排序,由短到长
		ArrayList<String> list = new ArrayList<String>();
		list.add("fhf");
		list.add("asd");
		list.add("grtfgh");
		list.add("edfg");
		
		Collections.sort(list, new CompareByLength());
		for (String string : list) {
			System.out.println(string);
		}
	}
}













