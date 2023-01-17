package com.dodo.study.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
		
		public static void main(String[] args) {
				List<String> list1 = new ArrayList<>();
				list1.add("apple");
				list1.add("pear");
				list1.add("apple"); //允许重复添加元素，size=3
				System.out.println(list1);
				System.out.println(list1.size());
				//List还允许添加null
				list1.add(null);
				String thrid = list1.get(3);
				System.out.println(thrid);
				
				
				
		}
}