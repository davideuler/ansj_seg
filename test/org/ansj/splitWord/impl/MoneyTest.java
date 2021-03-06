package org.ansj.splitWord.impl;

import org.ansj.splitWord.analysis.ToAnalysis;

public class MoneyTest {
	public static void main(String[] args) throws Exception {
		System.out.println("最大可用内存" + (Runtime.getRuntime().maxMemory() / 1000000));
		System.out.println("当前JVM空闲内存" + (Runtime.getRuntime().freeMemory() / 1000000));
		System.out.println("当前JVM占用的内存总数" + (Runtime.getRuntime().totalMemory() / 1000000));

		long begin = (Runtime.getRuntime().freeMemory() / 1000000);

		//分词内存占用
		ToAnalysis.paser("内存测试") ;

		
		System.out.println("分词系统使用了的内存" + (begin - Runtime.getRuntime().freeMemory() / 1000000));
		System.out.println("最大可用内存" + (Runtime.getRuntime().maxMemory() / 1000000));
		System.out.println("当前JVM空闲内存" + (Runtime.getRuntime().freeMemory() / 1000000));
		System.out.println("当前JVM占用的内存总数" + (Runtime.getRuntime().totalMemory() / 1000000));
	}
}
