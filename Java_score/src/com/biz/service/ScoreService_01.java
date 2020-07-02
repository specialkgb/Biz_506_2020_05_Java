package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.ScoreVO;
/*
 * 성적을 입력받아서 scoreList에 저장하고
 * 성적리스트를 출력하는 부분 정의
 */
public class ScoreService_01 {
	// 성적리스트를 저장하기 위한 객체
	private List<ScoreVO> scoreList;
	// 키보드를 사용해서 값들을 입력받기 위한 객체
	private Scanner scan;
	// scoreList, scan 객체를 선언한 뒤 사용할 수 있도록 생성자에서 두 객체를 초기화 한다
	// 이 과정을 생략하면 NullpointerException이 발생하기 쉽다
	public ScoreService_01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	public boolean inputScore() {
		System.out.println("학번을 입력해주세요. 종료하시려면 (END)를 입력하세요");
		String strNum = scan.nextLine();
		if (strNum.equals("END")) {
			System.out.println("입력값: " + strNum);
			return false;
		}
		
		System.out.println("국어 점수를 입력하세요 >> ");
		String strKor = scan.nextLine();
		int intStKor = 0;
		try {
			 intStKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("과목 점수는 숫자만 입력 가능합니다.");
			System.out.println("점수 입력이 잘못되어 0으로 임시 저장합니다");
		}
		
		
		System.out.println("영어 점수를 입력하세요 >> ");
		String strEng = scan.nextLine();
		int intStEng = 0;
		try {
			 intStEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("과목 점수는 숫자만 입력 가능합니다.");
			System.out.println("점수 입력이 잘못되어 0으로 임시 저장합니다");
		}

		int intStMath = 0;
		System.out.println("수학 점수를 입력하세요>> ");
		String strMath = scan.nextLine();
		try {
			 intStMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("과목 점수는 숫자만 입력 가능합니다.");
			System.out.println("점수 입력이 잘못되어 0으로 임시 저장합니다");
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(strKor);
		scoreVO.setEng(strEng);
		scoreVO.setMath(strMath);		
		scoreList.add(scoreVO);
				
		return true;
	} // inputScore end
	
	public void scoreList() {
		ScoreVO scoreVO = new ScoreVO();
		System.out.println("====================================================");
		System.out.println("성적일람표");
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");

		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO svo = scoreList.get(i);
			System.out.print(svo.getNum() + "\t");
			System.out.print(svo.getKor() + "\t");
			System.out.print(svo.getEng() + "\t");
			System.out.print(svo.getMath() + "\t");
			
			float fKor = Float.valueOf(svo.getKor());
			float fEng = Float.valueOf(svo.getEng());
			float fMath = Float.valueOf(svo.getMath());
			
			svo.setSum(fKor+fEng+fMath);
			svo.setAvg((fKor+fEng+fMath)/3);
			System.out.printf(svo.getSum() + "\t");
			System.out.printf(svo.getAvg() + "\n");
			//마지막에 줄 바꿈은 2가지 방법 끝에 \n을 넣거나 "System.out.println();"을 사용하거나.
		}
	}
}
