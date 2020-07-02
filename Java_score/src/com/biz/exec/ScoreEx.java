package com.biz.exec;

import com.biz.service.ScoreService_01;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		ScoreService_01 scoreService = new ScoreService_01();
		
		while (1 == 1) {
			if (!scoreService.inputScore()) {
				break;
			}
		}
		scoreService.scoreList();
		System.out.println("업무 종료");
	}

}