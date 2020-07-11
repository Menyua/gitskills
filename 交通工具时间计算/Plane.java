package com.ym.transport;

//飞机类
public class Plane extends Conveyance {
	//各阶段时间，距离，速度属性
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
		Time=ComeTime+ReturnTime+TicketTime+CheckTime+WaitingTime+distance/Speed;	//乘飞机需要的时间
		Price=distance*0.75;		//乘飞机的费用
		return Time;
	}
	
	//输出乘坐汽车需要的时间
	public void print() {
		System.out.println("乘坐"+Tname+"的时间为:"+String.format("%.2f", Time)+"小时");
	}

}
