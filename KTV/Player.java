package com.ym.KTV;

public class Player {
	//���ڵ��
    public  boolean addSong(Song s){
    	Master master= new Master();
    	master.listSong.add(s);
    	
	   return true;
	}

}
