package com.ym.Wages;

import java.util.Scanner;


//菜单
public class Menu {
	
	//二级菜单 
	
	public void Cmenu() {
		Company company=new Company();
		Person person=new Person();
		person.a();
		double staffwages=0;						//所有员工的工资
		for(int i=0;i<9;i++) {
			staffwages=staffwages+person.staff.get(i).Swages;
		}
		
		double managerwages=0;						//所有经理的工资
		for(int i=0;i<2;i++) {
			managerwages=managerwages+person.manager.get(i).Mwages+person.manager.get(i).reward;
		}
		
		double allwages=managerwages+staffwages;	//所有股东的工资
	
		System.out.println("总的月工资为:"+String.format("%.2f", allwages));
		System.out.println("公司的年度总营业额为:"+String.format("%.2f", company.wages*12));
		System.out.println("公司年度总利润为:"+String.format("%.2f", (company.wages-allwages)*12));
		System.out.println("");
	}
	//用来查询公司人员的信息
	@SuppressWarnings("resource")
	public void Pmenu() {
		Person person=new Person();
		person.a();
		
		System.out.println("查询公司人员信息:");
		System.out.println("1.查询员工信息");
		System.out.println("2.查询经理信息");
		System.out.println("3.查询股东信息");
		System.out.println("4.返回上一级");
		
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		
		while(a!=4) {
		switch(a){
		case 1:
		System.out.println("员工信息为:");
		for(int i=0;i<9;i++) {
			System.out.println("员工姓名:"+person.staff.get(i).Sname+"	工资:"+person.staff.get(i).Swages+"	生日:"+person.staff.get(i).Sbirthday);
		}
		a=s.nextInt();
		break;
		
		case 2:
		System.out.println("经理信息为:");
		for(int i=0;i<2;i++) {
			System.out.println("经理姓名:"+person.manager.get(i).Mname+"	工资:"+person.manager.get(i).Mwages+"	生日:"+person.manager.get(i).Mbirthday);
		}
		a=s.nextInt();
		break;

		case 3:
		System.out.println("股东信息为:");
		for(int i=0;i<3;i++) {
			System.out.println("股东姓名:"+person.boss.get(i).Bname+"	分红:"+person.boss.get(i).Bwages+"	生日:"+person.boss.get(i).Bbirthday);
		}
		a=s.nextInt();
		break;
		
		case 4:
			break;
		default:System.out.println("ERROR!"); break;
		}
		}
	}
	
	@SuppressWarnings({ "resource"})
	//二级菜单，用来查询发放工资当月是否有公司人员生日，
	public void Smenu() {
		Person person=new Person();
		person.a();
		
		System.out.println("请输入发工资日期:");
		Scanner s = new Scanner(System.in);
		double a=s.nextDouble();
		System.out.println("工资将于"+a+"这天发送");
		
		for(int i=0;i<9;i++) {
			if(Math.floor(a)==Math.floor(person.staff.get(i).Sbirthday))
				System.out.println(person.staff.get(i).Sname+person.staff.get(i).Sbirthday+"生日,本月获得礼物");
		}
		for(int i=0;i<2;i++) {
			if(Math.floor(a)==Math.floor(person.manager.get(i).Mbirthday))
				System.out.println(person.manager.get(i).Mname+"经理生日获得礼物");
		}
		for(int i=0;i<3;i++) {
			if(Math.floor(a)==12)
				System.out.println(person.boss.get(i).Bname+"股东已获得分红");
		}
		
		
	}
}
