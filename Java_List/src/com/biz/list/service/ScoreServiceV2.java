package com.biz.list.service;

import java.util.List;
import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	private List<ScoreVO> scores;

	public void scoreList(List<ScoreVO> scores) {
		this.scores = scores;
	}

	public void stSum() {
		int scoreSize = scores.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);

			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sVO.setStSum(sum);
		}
	}

	public void stAvg() {
		int scoreSize = scores.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			int sum = sVO.getStSum();
			sVO.setStAvg(sum / 3);
		}
	}

	public void scoreList() {
		System.out.println("============================================");
		System.out.println("\t\t성적리스트");
		System.out.println("============================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int sumSum = 0;
		int avgSum = 0;

		int scoreSize = scores.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			korSum += sVO.getKor();
			engSum += sVO.getEng();
			mathSum += sVO.getMath();
			sumSum += sVO.getStSum();
			avgSum += sVO.getStAvg();
		}

		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", sVO.getNum(), sVO.getKor(), sVO.getEng(), sVO.getMath(),
					sVO.getStSum(), sVO.getStAvg());
		}
	}
}