package com.ym.Wages;

//������
public class Manager extends Company {
	String Mname;
	double Mwages;
	double reward;
	double Mbirthday;
	
	public Manager() {}
	public Manager(String name,double wages,double reward,double birthday) {
		Mname=name;
		Mwages=wages;
		this.reward=reward;
		Mbirthday=birthday;

	}

}
