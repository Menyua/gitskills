package com.ym.KTV;
import java.util.ArrayList;

public class Master {
	  //�����赥
      ArrayList<Song> listSong=new ArrayList<>();
      Song s0=new Song("Զ��ƶĶ�","Ⱥ��",3.56);

      

	public Master(){
		//��ʼ���赥
		listSong.add(s0);
		
		
	}
	
	//���Ÿ���
	public  void play(){
		    if(listSong.size()>=1) {   //���ֻ��һ�׸�
			System.out.println("���ڲ��Ÿ���:"+listSong.toString());
			System.out.println("û����һ�ף�����");
		}
		    else {                     //���������׸�
		    	Song song1= listSong.get(0);
		    	Song song2= listSong.get(1);
				System.out.println("���ڲ���:"+song1.toString());
				System.out.println("��һ��:"+song2.toString());
		    }
	   
	}

}
