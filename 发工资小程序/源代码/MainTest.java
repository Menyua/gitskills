package com.ym.Wages;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.Scanner;

public class MainTest {
	
	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		

		int a=0;
		Scanner s = new Scanner(System.in);

		
		while(a!=3) {
			Menu menu=new Menu();
			//一级菜单
			System.out.println("公司工资操作:");
			System.out.println("1.查询公司营业信息");
			System.out.println("2.查询人员信息");
			System.out.println("3.公司发工资日期(如9月1号:9.01)");
			System.out.println("请选择:");
			a=s.nextInt();
			switch(a) {
			case 1:
				menu.Cmenu(); //公司的营业情况输出
				break;
			case 2:
				menu.Pmenu(); //公司人员信息查询菜单
				break;
			case 3:
				menu.Smenu(); //工资发放日菜单
			default:System.out.println("ERROR!"); break;
			}
		
		}
	}

}
