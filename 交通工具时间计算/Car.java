package com.ym.transport;

//������
public class Car extends Conveyance {
	//���׶�ʱ�䣬���룬�ٶ�����
	String Tname="car";
	double ComeTime=1.0;
	double ReturnTime=1.0;
	double TicketTime=0.1;
	double CheckTime=0.1;
	double WaitingTime=0.3;
	double Speed=90;
	double Price;
	double Time;
	
	public double consume(double distance) {
		Time=ComeTime+ReturnTime+TicketTime+CheckTime+WaitingTime+distance/Speed;	//��������Ҫ��ʱ��
		Price=distance*0.32;		//�������ĳ���
		return Time;
	}
	
	//�������������Ҫ��ʱ��
	public void print() {
		System.out.println("����"+Tname+"��ʱ��Ϊ:"+String.format("%.2f", Time)+"Сʱ");
		
	}

}
