package com.ym.transport;

//��ͨ������
public abstract class Conveyance {
	//���׶�ʱ�䣬���룬�ٶ�����
	String Tname;
	double ComeTime;
	double ReturnTime;
	double TicketTime;
	double CheckTime;
	double WaitingTime;
	double Speed;
	double Price;
	
	abstract public double consume(double distance);	//���㽻ͨ���ߵ�ʵ�ʺͼ�Ǯ
	public void print() {			//�����ͨ�����ܹ���Ҫʱ��
		
	}

}
