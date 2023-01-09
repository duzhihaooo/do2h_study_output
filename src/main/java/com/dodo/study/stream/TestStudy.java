package com.dodo.study.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestStudy {
	public static void main(String[] args) {
		//Stream（流）是一个来自数据源的元素队列并支持聚合操作
		//元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
		//数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
		//聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。
		
		//1.map
		//map 方法用于映射每个元素到对应的结果
		List<Integer> nums = Arrays.asList(1, 3, 7, 4, 9, 3);
		final List<Integer> squares = nums.stream()
				.map(i -> i * i)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("squares:" + squares);
		
		//2.filter
		//filter 方法用于通过设置的条件过滤出元素
		List<String> stringList = Arrays.asList("kiki", "Tom", "Alex", "", "vvs");
		//过滤后的空字符串的数量
		// 计算空字符串
		final long countEmptyString = stringList.stream()
				.filter(str -> str.isEmpty())
				.count();
		System.out.println("空字符串数量：" + countEmptyString);
		
		//3.limit
		//limit 方法用于获取指定数量的流
		Random random = new Random();
		random.ints()
				.limit(10)    //截取10个元素
				.forEach(System.out::println);
		System.out.println("------------------");
		//4.sorted
		//sorted 方法用于对流进行排序  默认升序
		random.ints()
				.limit(10)
				.sorted()
				.forEach(System.out::println);
		
		//5.Collectors
		//Collectors 类实现了很多归约操作,例如将流转换成集合和聚合元素
		List<String> strings = Arrays.asList("abcd", "", "7777", "HelloWorld");
		final List<String> filterList = strings.stream()
				.filter(str -> !str.isEmpty())
				.collect(Collectors.toList());
		
		System.out.println("筛选后的StringList:" + filterList);
		//删除空字符串，并使用横线把它们合并起来
		final String mergedString = strings.stream()
				.filter(str -> !str.isEmpty())
				//joinning() 无参数方法会返回一个 Collectors 实例，并且以空字符串 ( "" ) 来拼接收集到的所有元素
				.collect(Collectors.joining("-"));
		System.out.println("合并字符串:" + mergedString);
		
		//6.统计
		//一些产生统计结果的收集器也非常有用，主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果
		List<Integer> nums2 = Arrays.asList(3, 4, 5, 3, 4, 5, 4, 3);
		final IntSummaryStatistics intSummaryStatistics = nums2.stream()    // 改造Integer流
				.mapToInt(x -> x)
				.summaryStatistics();    //用于收集统计信息(例如计数，最小值，最大值，总和和平均值)的状态对象
		
		System.out.println("数组个数:" + intSummaryStatistics.getCount());
		System.out.println("数组之和:" + intSummaryStatistics.getSum());
		System.out.println("数组最小值:" + intSummaryStatistics.getMin());
		System.out.println("数组最大值:" + intSummaryStatistics.getMax());
		System.out.println("数组平均数:"+intSummaryStatistics.getAverage());
		
		
	}
}
