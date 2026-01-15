package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
			public static void main(String[] args) {
				//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
				// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
				//1) URL 객체 생성
				// 2)URLConnection 객체 생성
				// 3)입력 스트림 생성
				// 4)전달받은 데이터를 화면에 출력
				
				
				
				try {
					String serviceKey = "ec77adf5e2fe128b506b4bcb59f86896b932e4c5f8add936a51e1cb594a70e1f";
					String serviceURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
					
					serviceURL += "?serviceKey=ec77adf5e2fe128b506b4bcb59f86896b932e4c5f8add936a51e1cb594a70e1f";
					serviceURL += "&stationName="+ URLEncoder.encode("종로구","UTF-8");
					serviceURL += "&dataTerm="+"DAILY";
					
//					serviceURL += "&returnType" + URLEncoder.encode("returnType","UTF-8");
//					serviceURL += "&numOfRows" + URLEncoder.encode("numOfRows","UTF-8");
					
					
					
					URL url = new URL(serviceURL);
					URLConnection conn = url.openConnection();
					
					try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
							
							){
								
						String line = null;
						while((line=br.readLine())!=null) {
							System.out.println(line); // dataTime만 가져와야하는데?
							
						}
					
					
					}
					
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				
			}
			
			}
