package com.ym.transport;

//�ɻ���
public class Plane extends Conveyance {
	//���׶�ʱ�䣬���룬�ٶ�����
	String Tname="plane";
	double ComeTime=1.0;
	double ReturnTime=1.0;
	double TicketTime=0.5;
	double CheckTime=0.3;
	double WaitingTime=1.0;
	double Speed=900;
	double Price;
	double Time;
	
	public double consume(double distance) {
		Time=ComeTime+ReturnTime+TicketTime+CheckTime+WaitingTime+distance/Speed;	//�˷ɻ���Ҫ��ʱ��
		Price=distance*0.75;		//�˷ɻ��ķ���
		return Time;
	}
	
	//�������������Ҫ��ʱ��
	public void print() {
		System.out.println("����"+Tname+"��ʱ��Ϊ:"+String.format("%.2f", Time)+"Сʱ");
	}

}
