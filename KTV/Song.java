package com.ym.KTV;

public class Song {
    String songName;
	String singer;
	double time;
	public Song(){//�޲ι��캯��
		}
    
	//�����βεĹ��캯������ʼ��������Ϣ
	public Song(String songName,String singer,double time){
	   this.songName=songName;
	   this.singer=singer;
	   this.time=time;
	}
	
	public String toString() {
		return " ����:" + songName + ", ����:" + singer + ", ����ʱ��:" + time ;
	}

}
