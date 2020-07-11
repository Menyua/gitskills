package com.ym.KTV;
import java.util.ArrayList;

public class Master {
	  //创建歌单
      ArrayList<Song> listSong=new ArrayList<>();
      Song s0=new Song("远离黄赌毒","群星",3.56);

      

	public Master(){
		//初始化歌单
		listSong.add(s0);
		
		
	}
	
	//播放歌曲
	public  void play(){
		    if(listSong.size()>=1) {   //如果只有一首歌
			System.out.println("现在播放歌曲:"+listSong.toString());
			System.out.println("没有下一首，请点歌");
		}
		    else {                     //至少有两首歌
		    	Song song1= listSong.get(0);
		    	Song song2= listSong.get(1);
				System.out.println("正在播放:"+song1.toString());
				System.out.println("下一首:"+song2.toString());
		    }
	   
	}

}
