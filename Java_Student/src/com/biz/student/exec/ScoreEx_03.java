package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여
 * score.txt
 */
public class ScoreEx_03 {

	public static void main(String[] args) {

		PrintStream outPut = System.out;
		String outFile = "src/com/biz/student/exec/score.txt";

		// 지금부터 outFile 변수에 저장된 파일이름으로
		// text를 기록하기 위해 파일을 만들어라
		try {
			outPut = new PrintStream(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Random rnd = new Random();

		for (int i = 0; i < 30; i++) {

			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			int intSum = intKor + intEng + intMath;
			float floatAvg = (float)intSum / 3;
			
			// System.out.printf()
			String score = String.format("%05d:%d:%d:%d:%d:%06.2f",
					i+1,intKor,intEng,intMath,intSum,floatAvg);
			
			outPut.println(score);
		}
		outPut.close();
		System.out.println("완료!!!");
	}
}
