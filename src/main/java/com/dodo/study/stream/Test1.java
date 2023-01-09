package com.dodo.study.stream;

import com.dodo.study.inout.In;

import java.util.Arrays;
import java.util.List;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		// 计算空字符串
		List<String> strings = Arrays.asList("aaaa", "kiki", "", "bbb", "");
		long count = getCountEmptyString(strings);
		System.out.println("空字符数量为: " + count);
		count = getCountLength3(strings);
		System.out.println("字符串长度为3的数量:" + count);
		
		// 删除空字符串
		List<String> deleteEmptyString = deleteEmptyString(strings);
		System.out.println("原字符串List:" + strings);
		System.out.println("无空字符串的List:" + deleteEmptyString);
		
		// 删除空字符串，并使用横线把它们合并起来
		String mergedString = getMergedStrin(strings, "-");
		System.out.println("合并字符串: " + mergedString);
		
		// 获取列表元素平方数
		List<String> numStringList = Arrays.asList("1,3,5,7,9","1,1");
		final List<String> collect = numStringList.stream()
				.map(x -> x.split(","))
				.flatMap(i -> Arrays.stream(i))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		
	}
	

	
	public static String getMergedStrin(List<String> strings, String separator) {
		final String mergedString = strings.stream()
				.filter(x -> !x.isEmpty())
				.collect(Collectors.joining(separator));
		return mergedString;
	}
	
	public static List<String> deleteEmptyString(List<String> strings) {
		final List<String> filterList = strings.stream()
				.filter(x -> !x.isEmpty())
				.collect(Collectors.toList());
		return filterList;
	}
	
	public static long getCountEmptyString(List<String> strings) {
		long count = 0;
		count = strings.stream()
				.filter(x -> x.isEmpty())
				.count();
		return count;
	}
	
	public static long getCountLength3(List<String> strings) {
		final long count = strings.stream()
				.filter(x -> x.length() == 3)
				.count();
		return count;
	}
}
