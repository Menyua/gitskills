package com.ym.KTV;

public class SongDrive {
	public Master m;
	public Player p;
	
	//初始化主持人类和用户类
	public SongDrive(){
		m= new Master();
		p= new Player();

	}
	//歌曲库歌曲信息
     static Song s1=new Song("晴天","周杰伦",4.26);
     static Song s2=new Song("哑巴","薛之谦",4.21);
     static Song s3=new Song("刚刚好","薛之谦",4.10);
    
	public static void main(String[] args){
		
		SongDrive drive= new SongDrive(); // 初始化SongDrive用来调用用户和主持人类
		while(drive.m.listSong==null) {
		System.out.println("请点歌");
		drive.p.addSong(s1);
		}
		drive.m.play();
	
	}

}
