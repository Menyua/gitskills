package com.ym.transport;

//交通工具类
public abstract class Conveyance {
	//各阶段时间，距离，速度属性
	String Tname;
	double ComeTime;
	double ReturnTime;
	double TicketTime;
	double CheckTime;
	double WaitingTime;
	double Speed;
	double Price;
	
	abstract public double consume(double distance);	//计算交通工具的实际和价钱
	public void print() {			//输出交通工具总共需要时间
		
	}

}
