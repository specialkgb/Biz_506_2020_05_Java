package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.ScoreVO;

public class ScoreService_01 {

	private List<ScoreVO> scoreList;
	
	private Scanner scan;

	public ScoreService_01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public boolean inputScore() {
		String stNum = scan.nextLine();
		System.out.println("입력값(중단:END): " + stNum);
		if (stNum.equals("END")) {
			return false;
		}
		
		int intStKor, intStEng, intStMath = 0;

		String stKor = scan.nextLine();
		System.out.println("국어: " + stKor);
		
		String stEng = scan.nextLine();
		System.out.println("영어: " + stEng);
	
		String stMath = scan.nextLine();
		System.out.println("수학: " + stMath);
		
		
		try {
			 intStKor = Integer.valueOf(stKor);
			 intStEng = Integer.valueOf(stEng);
			 intStMath = Integer.valueOf(stMath);
		} catch (Exception e) {
			System.out.println("과목 점수는 숫자만 입력 가능합니다.");
			System.out.println("점수 입력이 잘못되어 0으로 임시 저장합니다");
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.stNum(stNum);
		
		scoreList.add(scoreVO);
		
		
		
		return true;
	}
}
