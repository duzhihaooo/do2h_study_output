package com.dodo.study.collection;

import com.dodo.study.inout.In;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
		
		public static void main(String[] args) {
				Map<String, Integer> map1 = new HashMap<>();
				map1.put("bibi", 18);
				map1.put("lucky", 22);
				map1.put("bruce", 25);
				map1.put("Jack", 35);
				System.out.println(map1);
				
				Map<String, Integer> map2 = new HashMap<String, Integer>();
				map2.put("张三丰", 100);
				map2.put("虚竹", 20);
				System.out.println("map2:" + map2);
				
				map1.putAll(map2);
				System.out.println("map1:" + map1);

				// 指定key，返回删除的键值对映射的值。
				System.out.println("value:" + map1.remove("bruce"));
				map1.clear();
				System.out.println("map1:"+map1);
		}
}