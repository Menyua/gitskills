package com.ym.Wages;

import java.util.Scanner;


//�˵�
public class Menu {
	
	//�����˵� 
	
	public void Cmenu() {
		Company company=new Company();
		Person person=new Person();
		person.a();
		double staffwages=0;						//����Ա���Ĺ���
		for(int i=0;i<9;i++) {
			staffwages=staffwages+person.staff.get(i).Swages;
		}
		
		double managerwages=0;						//���о���Ĺ���
		for(int i=0;i<2;i++) {
			managerwages=managerwages+person.manager.get(i).Mwages+person.manager.get(i).reward;
		}
		
		double allwages=managerwages+staffwages;	//���йɶ��Ĺ���
	
		System.out.println("�ܵ��¹���Ϊ:"+String.format("%.2f", allwages));
		System.out.println("��˾�������Ӫҵ��Ϊ:"+String.format("%.2f", company.wages*12));
		System.out.println("��˾���������Ϊ:"+String.format("%.2f", (company.wages-allwages)*12));
		System.out.println("");
	}
	//������ѯ��˾��Ա����Ϣ
	@SuppressWarnings("resource")
	public void Pmenu() {
		Person person=new Person();
		person.a();
		
		System.out.println("��ѯ��˾��Ա��Ϣ:");
		System.out.println("1.��ѯԱ����Ϣ");
		System.out.println("2.��ѯ������Ϣ");
		System.out.println("3.��ѯ�ɶ���Ϣ");
		System.out.println("4.������һ��");
		
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		
		while(a!=4) {
		switch(a){
		case 1:
		System.out.println("Ա����ϢΪ:");
		for(int i=0;i<9;i++) {
			System.out.println("Ա������:"+person.staff.get(i).Sname+"	����:"+person.staff.get(i).Swages+"	����:"+person.staff.get(i).Sbirthday);
		}
		a=s.nextInt();
		break;
		
		case 2:
		System.out.println("������ϢΪ:");
		for(int i=0;i<2;i++) {
			System.out.println("��������:"+person.manager.get(i).Mname+"	����:"+person.manager.get(i).Mwages+"	����:"+person.manager.get(i).Mbirthday);
		}
		a=s.nextInt();
		break;

		case 3:
		System.out.println("�ɶ���ϢΪ:");
		for(int i=0;i<3;i++) {
			System.out.println("�ɶ�����:"+person.boss.get(i).Bname+"	�ֺ�:"+person.boss.get(i).Bwages+"	����:"+person.boss.get(i).Bbirthday);
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
	//�����˵���������ѯ���Ź��ʵ����Ƿ��й�˾��Ա���գ�
	public void Smenu() {
		Person person=new Person();
		person.a();
		
		System.out.println("�����뷢��������:");
		Scanner s = new Scanner(System.in);
		double a=s.nextDouble();
		System.out.println("���ʽ���"+a+"���췢��");
		
		for(int i=0;i<9;i++) {
			if(Math.floor(a)==Math.floor(person.staff.get(i).Sbirthday))
				System.out.println(person.staff.get(i).Sname+person.staff.get(i).Sbirthday+"����,���»������");
		}
		for(int i=0;i<2;i++) {
			if(Math.floor(a)==Math.floor(person.manager.get(i).Mbirthday))
				System.out.println(person.manager.get(i).Mname+"�������ջ������");
		}
		for(int i=0;i<3;i++) {
			if(Math.floor(a)==12)
				System.out.println(person.boss.get(i).Bname+"�ɶ��ѻ�÷ֺ�");
		}
		
		
	}
}
