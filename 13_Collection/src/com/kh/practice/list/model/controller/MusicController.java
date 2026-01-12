package com.kh.practice.list.model.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;
import com.kh.practice.list.model.compare.AscTitle;

public class MusicController {
				private List<Music> list = new ArrayList();
				
				public int addList(Music music) {
					
					try {
						list.add(music);
						return 1;
						
					}catch(Exception e) {
						return 0;
					}
				}
				
				public int addAtZero(Music music) {
					
				try{
					list.add(0, music);
					return 1;
				}catch(Exception e) {
					return 0;
				}
				}
				
				
				public List<Music> printAll() {
					return list;
				}
				
				public Music searchMusic(String title) {
//					for(int i=0; i<list.size();i++) {
//						if(list.get(i).equals(title)) {
//							return (Music)(list.get(i));
//						}
//						
//					}return null;
					
					Music m=null;
					for(Object o : list) {
						Music music = (Music)o;
						m = music;
						
					}
					
//					// 방법 2.
//					Object o = searchMusic(title);
//					m = (Music)o;
//					list.remove(o);
					return null;

				}
				
				public Music removeMusic(String title) {
					
					// 방법 1.
					for(int i=0; i<list.size();i++) {
						if(list.get(i).equals(title)) {
							list.remove(i);
						}
						
						
					}
					return null;
						
				}
				
				
				
				public Music setMusic(String title, Music music) {
					int index=-1;
					Music result = null;
					
					try {
						for(int i=0; i<list.size();i++) {
							if(((Music)list).getTitle().equals(title)) {
								index = i;
								result = music;
								break;		
				}
			}
				list.set(index, result);
				return result;
		}catch(Exception e) {
			return null;
		}
	}
				
				
				
				public int ascTitle() {
					Collections.sort(list,new AscTitle());
					return 1;
				}
				
				public int descSinger() {
//					Comparator<Object> comp = Collections.reverseOrder();
//					Collections.sort(list,comp);
					
					Collections.sort(list);
					return 1;
				}
				
				
				
				
}

