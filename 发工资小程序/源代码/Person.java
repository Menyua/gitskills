package com.ym.Wages;

import java.util.ArrayList;

// ��˾��Ա����Ϣ��
public class Person {

	Company company=new Company();
	ArrayList<Manager> manager=new ArrayList<Manager>(); //�������Ϣ������
	ArrayList<Staff> staff=new ArrayList<Staff>(); //��ͨԱ������Ϣ������
	ArrayList<Boss> boss=new ArrayList<Boss>(); //�ɶ�����Ϣ������

	public void a() {
		
		double staffwages=0;						//����Ա���Ĺ���
		double managerwages=0;						//���о���Ĺ���

	
		//Ա������Ϣ
		Staff s1=new Staff("����",5000,1.21);
		Staff s2=new Staff("����",5000,5.24);
		Staff s3=new Staff("����",6000,4.25);
		Staff s4=new Staff("������",9000,8.16);
		Staff s5=new Staff("�ﻨ�",9000,6.17);
		Staff s6=new Staff("��ս",5800,5.28);
		Staff s7=new Staff("�ܴ���",8000,6.17);
		Staff s8=new Staff("��С��",7000,7.15);
		Staff s9=new Staff("��С��",6500,10.15);
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
//		System.out.println("ÿ������Ա���Ĺ���"+staffwages);
		
		//�������Ϣ
		Manager m1=new Manager("�Ž�",15000,5000,10.10);
		Manager m2=new Manager("��Ц",13000,5000,2.05);
		manager.add(m1);
		manager.add(m2);
		
		for(int i=0;i<2;i++) {
			managerwages=managerwages+manager.get(i).Mwages+manager.get(i).reward;
		}

//		System.out.println("ÿ�����о���Ĺ���"+managerwages);
		//ÿ�µ��ܹ���
		
		double allwages=managerwages+staffwages;	//���йɶ��Ĺ���
		//�ɶ�����Ϣ
		Boss b1=new Boss("�Ż���",(company.wages-allwages)*12*0.1*0.5,9.23);
		Boss b2=new Boss("����",(company.wages-allwages)*12*0.1*0.2,6.16);
		Boss b3=new Boss("����",(company.wages-allwages)*12*0.1*0.2,6.16);
		boss.add(b1);
		boss.add(b2);
		boss.add(b3);
	

	}

}
