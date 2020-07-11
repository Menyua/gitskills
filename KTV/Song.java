package com.ym.KTV;

public class Song {
    String songName;
	String singer;
	double time;
	public Song(){//无参构造函数
		}
    
	//带有形参的构造函数，初始化歌曲信息
	public Song(String songName,String singer,double time){
	   this.songName=songName;
	   this.singer=singer;
	   this.time=time;
	}
	
	public String toString() {
		return " 歌名:" + songName + ", 歌手:" + singer + ", 歌曲时长:" + time ;
	}

}
