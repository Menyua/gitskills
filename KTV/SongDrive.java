package com.ym.KTV;

public class SongDrive {
	public Master m;
	public Player p;
	
	//��ʼ������������û���
	public SongDrive(){
		m= new Master();
		p= new Player();

	}
	//�����������Ϣ
     static Song s1=new Song("����","�ܽ���",4.26);
     static Song s2=new Song("�ư�","Ѧ֮ǫ",4.21);
     static Song s3=new Song("�ոպ�","Ѧ֮ǫ",4.10);
    
	public static void main(String[] args){
		
		SongDrive drive= new SongDrive(); // ��ʼ��SongDrive���������û�����������
		while(drive.m.listSong==null) {
		System.out.println("����");
		drive.p.addSong(s1);
		}
		drive.m.play();
	
	}

}
