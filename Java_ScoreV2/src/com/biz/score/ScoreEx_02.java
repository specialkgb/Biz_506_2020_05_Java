package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		// interface를 사용하여 객체(인스턴스)를 정의(선언)하고
		// 실제코드는 정의된 클래스의 method에 구현된 코드를 사용한다.
		ScoreService sService = new ScoreServiceImplV1();
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}

}
