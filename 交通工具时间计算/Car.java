package com.ym.transport;

//汽车类
public class Car extends Conveyance {
	//各阶段时间，距离，速度属性
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
		Time=ComeTime+ReturnTime+TicketTime+CheckTime+WaitingTime+distance/Speed;	//乘汽车需要的时间
		Price=distance*0.32;		//乘汽车的车费
		return Time;
	}
	
	//输出乘坐汽车需要的时间
	public void print() {
		System.out.println("乘坐"+Tname+"的时间为:"+String.format("%.2f", Time)+"小时");
		
	}

}
