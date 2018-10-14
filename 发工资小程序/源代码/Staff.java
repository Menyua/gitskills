package com.ym.Wages;

//普通员工类
public class Staff extends Company {
	String Sname;
	double Swages;
	double Sbirthday;
	
	public Staff() {}
	public Staff(String name,double wages,double birthday) {
		Sname=name;
		Swages=wages;
		Sbirthday=birthday;

	}

}
