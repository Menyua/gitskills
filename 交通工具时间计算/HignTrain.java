package com.ym.transport;

//������
public class HignTrain extends Conveyance {
	//���׶�ʱ�䣬���룬�ٶ�����
	String Tname="hightrain";
	double ComeTime=1.0;
	double ReturnTime=1.0;
	double TicketTime=0.3;
	double CheckTime=0.2;
	double WaitingTime=0.5;
	double Speed=300;
	double Price;
	double Time;
	
	public double consume(double distance) {
		Time=ComeTime+ReturnTime+TicketTime+CheckTime+WaitingTime+distance/Speed;	//�˸�����Ҫ��ʱ��
		Price=distance*0.45;		//�˸����ĳ���
		return Time;
	}
	
	//�������������Ҫ��ʱ��
	public void print() {
		System.out.println("����"+Tname+"��ʱ��Ϊ:"+String.format("%.2f", Time)+"Сʱ");
	}

}
