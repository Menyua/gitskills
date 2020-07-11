package com.ym.transport;

import java.util.Scanner;

public class Contorl {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//创建三个交通工具类
		Car car=new Car();
		HignTrain train=new HignTrain();
		Plane plane=new Plane();

		//输入
		System.out.println("请输入出发地:");
		String Start=s.next();
		System.out.println("请输入目的地:");
		String End=s.next();
		System.out.println("请输入距离:");
		float Dis=s.nextFloat();
		
		//调用计算函数，得到交通工具的时间
		car.consume(Dis);
		train.consume(Dis);
		plane.consume(Dis);

		//输出各个交通工具的时间
		car.print();
		train.print();
		plane.print();
		

	}

}
