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
			//һ���˵�
			System.out.println("��˾���ʲ���:");
			System.out.println("1.��ѯ��˾Ӫҵ��Ϣ");
			System.out.println("2.��ѯ��Ա��Ϣ");
			System.out.println("3.��˾����������(��9��1��:9.01)");
			System.out.println("��ѡ��:");
			a=s.nextInt();
			switch(a) {
			case 1:
				menu.Cmenu(); //��˾��Ӫҵ������
				break;
			case 2:
				menu.Pmenu(); //��˾��Ա��Ϣ��ѯ�˵�
				break;
			case 3:
				menu.Smenu(); //���ʷ����ղ˵�
			default:System.out.println("ERROR!"); break;
			}
		
		}
	}

}
