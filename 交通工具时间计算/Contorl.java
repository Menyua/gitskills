package com.ym.transport;

import java.util.Scanner;

public class Contorl {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//����������ͨ������
		Car car=new Car();
		HignTrain train=new HignTrain();
		Plane plane=new Plane();

		//����
		System.out.println("�����������:");
		String Start=s.next();
		System.out.println("������Ŀ�ĵ�:");
		String End=s.next();
		System.out.println("���������:");
		float Dis=s.nextFloat();
		
		//���ü��㺯�����õ���ͨ���ߵ�ʱ��
		car.consume(Dis);
		train.consume(Dis);
		plane.consume(Dis);

		//���������ͨ���ߵ�ʱ��
		car.print();
		train.print();
		plane.print();
		

	}

}
