package com.biz.grade;

import java.util.Random;

/*
 *학생 20명, 과목 5과목의 성적처리 
 * 
 */
public class Grade_03 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int stdCount = 20; // 학생 인원수
		int subCount = 5 + 2; // 과목 5개와 총점, 평균을 저장할 배열

		// 값으로 배열 선언하기
		// 배열을 값으로 선언할 때는 {} 끝에 반드시 ;을 붙여라
		String[] subTitle = new String[] { "학번", "국어", "영어", "수학", "음악", "미술", "총점", "평균"

		};

		// stdCount X subCount 개의 공간을 갖는 2차원 배열로 선언
		int[][] score = new int[stdCount][subCount];

		// 점수를 배열에 채워넣는 곳
		for (int i = 0; i < stdCount; i++) {

			// 총점항목과 평균항목을 제외하고 과목부분만 점수를 채워넣기
			for (int j = 0; j < subCount - 2; j++) {
				score[i][j] = rnd.nextInt(50) + 51;
			}
		}

		// 과목별 총점과 평균
		// score[i][개수의 -2] : 총점
		// score[i][개수의 -1] : 평균

		int stdSum = 0;
		for (int i = 0; i < stdCount; i++) {

			for (int j = 0; j < subCount - 2; j++) {
				score[i][subCount - 2] += score[i][j];
			}
			score[i][subCount - 1] = score[i][subCount - 2] / (subCount - 2);
		}

		// 학생별 총점, 평균을 계산하여 보관할 배열 선언
		int[][] intTotal = new int[2][subCount];

		// 이중 for문이 반복되는 방향이
		// 세로, 가로 >> 가로, 세로 방향으로 진행이 되어야 한다.
		// 각 과목을 지정하는 반복이 첫번(i)반복
		for (int i = 0; i < subCount; i++) {
			
			//각 학생을 지정하는 반복이 두번째(j) 반복이 된다.
			for (int j = 0; j < stdCount; j++) {
				intTotal[0][i] += score[j][i];
			}

		}

		System.out.println("================================================================");
		System.out.println("\t\t\t성적일람표");
		System.out.println("----------------------------------------------------------------");
		/*
		 * 배열.lenth : 배열의 개수가 몇개인지 알려주는 키워드 변수, 필드변수, 멤버변수
		 * 
		 * 배열의 개수가 궁금할 때 일일이 세어보지 않아도, 몇개인지 알 수 있는 키워드 변수이다.
		 */

		for (int i = 0; i < subTitle.length; i++) {
			System.out.printf("%s\t", subTitle[i]);
		}

		System.out.println("\n----------------------------------------------------------------");

		for (int i = 0; i < stdCount; i++) {
			System.out.printf("%d\t", (i + 1));
			for (int j = 0; j < subCount; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------");
		System.out.printf("총점\t");
		for (int i = 0; i < subCount; i++) {
			System.out.printf("%d\t", intTotal[0][i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.printf("평균\t");
		for (int i = 0; i < subCount; i++) {
			System.out.printf("%d\t", intTotal[0][i] / stdCount);
		}
	}
}