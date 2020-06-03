package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] scoreList) {

		LineService line = new LineService();
		System.out.println(line.do_line(50));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(50));

		for (int i = 0 ; i < scoreList.length; i++) {
			int sum = scoreList[i].getKor();
			sum += scoreList[i].getEng();
			sum += scoreList[i].getMath();
			int avg = sum / 3;

			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", scoreList[i].getName(), scoreList[i].getKor(),
					scoreList[i].getEng(), scoreList[i].getMath(), sum, avg);

		}
		System.out.println();

	}

}