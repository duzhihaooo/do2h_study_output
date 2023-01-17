package com.dodo.study.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
		
		public static void main(String[] args) {
				Set<String> set = new HashSet<>();
				System.out.println(set.add("abc")); //true
				System.out.println(set.add("bbb")); //true
				System.out.println(set.add("bbb")); //false,添加失败，因为元素已存在
				System.out.println("-------------------");
				System.out.println(set.contains("abc"));    //true
				System.out.println(set.contains("ABC"));    //false,元素不存在
				System.out.println(set.remove("xxxx")); //false,删除失败,元素不存在
				System.out.println(set.size()); //2,一共两个元素
				
				set.add("apple");
				set.add("pear");
				set.add("banana");
				set.add("orange");
				for (String s:set){
						System.out.println(s);
				}
				
				
				
				
				
		
		
		}
}