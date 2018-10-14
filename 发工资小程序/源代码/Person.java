package com.ym.Wages;

import java.util.ArrayList;

// 公司人员的信息类
public class Person {

	Company company=new Company();
	ArrayList<Manager> manager=new ArrayList<Manager>(); //经理的信息对象组
	ArrayList<Staff> staff=new ArrayList<Staff>(); //普通员工的信息对象组
	ArrayList<Boss> boss=new ArrayList<Boss>(); //股东的信息对象组

	public void a() {
		
		double staffwages=0;						//所有员工的工资
		double managerwages=0;						//所有经理的工资

	
		//员工的信息
		Staff s1=new Staff("张三",5000,1.21);
		Staff s2=new Staff("李四",5000,5.24);
		Staff s3=new Staff("马六",6000,4.25);
		Staff s4=new Staff("吴铁柱",9000,8.16);
		Staff s5=new Staff("田花妞",9000,6.17);
		Staff s6=new Staff("萧战",5800,5.28);
		Staff s7=new Staff("周大伦",8000,6.17);
		Staff s8=new Staff("李小建",7000,7.15);
		Staff s9=new Staff("葛小伦",6500,10.15);
		staff.add(s1);
		staff.add(s2);
		staff.add(s3);
		staff.add(s4);
		staff.add(s5);
		staff.add(s6);
		staff.add(s7);
		staff.add(s8);
		staff.add(s9);
		
		for(int i=0;i<9;i++) {
			staffwages=staffwages+staff.get(i).Swages;
		}
//		System.out.println("每月所有员工的工资"+staffwages);
		
		//经理的信息
		Manager m1=new Manager("张江",15000,5000,10.10);
		Manager m2=new Manager("王笑",13000,5000,2.05);
		manager.add(m1);
		manager.add(m2);
		
		for(int i=0;i<2;i++) {
			managerwages=managerwages+manager.get(i).Mwages+manager.get(i).reward;
		}

//		System.out.println("每月所有经理的工资"+managerwages);
		//每月的总工资
		
		double allwages=managerwages+staffwages;	//所有股东的工资
		//股东的信息
		Boss b1=new Boss("张化腾",(company.wages-allwages)*12*0.1*0.5,9.23);
		Boss b2=new Boss("王云",(company.wages-allwages)*12*0.1*0.2,6.16);
		Boss b3=new Boss("马建林",(company.wages-allwages)*12*0.1*0.2,6.16);
		boss.add(b1);
		boss.add(b2);
		boss.add(b3);
	

	}

}
