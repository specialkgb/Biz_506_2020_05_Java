package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * scores 인스턴스배열을 필드변수로 선언한 이유
	 * Ex클래스에서 Service 클래스에서 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할 때마다 scores 인스턴스 배열을 매개변수로 전달할 수도 있지만
	 * 한번만 변수로 전달해서 Service클래스가 scores인스턴스를 보관하도록 하고
	 * 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함이다
	 * 
	 * Ex클래스에서 요청들을 할 때마다 scores 배열을 매개변수로 전달을 하면 요청과
	 * 요청사이에서 다른 코드에 의해 scores 배열값이 변형되어 결과가 엉뚱하게 나타나는 것을
	 * 방지하는 목적도 있다.
	 */

	private ScoreVO[] scores;
	
	/*
	 * ScoreServiceV1 클래스를 사용해서
	 * 어떤 연산을 수행하려고 할 때
	 * 반드시 setScore() method를 통해서 scores값을
	 * 매개변수로 주입을 해주어야 한다.
	 * 그렇지 않으면 scores 인스턴스 필드 변수가
	 * 아직 준비가 안된 상태이기 때문에 이후에 호출되는 method()들에서
	 * NullpointerException이 발생을 한다.
	 */

	public void setScores(ScoreVO[] scores) {
		this.scores = scores;
	}
	
	/*
	 * 필드변수로 scores 선언되어 있기 때문에
	 * 학생 총점과 평균을 계산한 후
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */
	public void scoreSum() {
		
		for(int i = 0 ; i< scores.length ; i++) {
			int sum = this.scores[i].getIntKor();
			sum += this.scores[i].getIntEng();
			sum += this.scores[i].getIntMath();
			sum += this.scores[i].getIntMusic();
			this.scores[i].setIntSum(sum);			
		}

	}

	
	public void scoreAvg() {
		for(int i = 0 ; i< scores.length ; i++) {
			int sum = this.scores[i].getIntSum();
			this.scores[i].setIntSum(sum / 4);
		}

	}

	
	public void scoreList() {
		
		LineService line = new LineService();
		int intLineLength = 50;
		
		System.out.println(line.do_line(intLineLength));
		System.out.println("성적 리스트");
		System.out.println(line.do_line(intLineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(intLineLength));
		
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		int intSumSum = 0;
		int intAvgSum = 0;
		
		// 점수리스트를 표시할 때는 for 반복문을 이용해서 사용한다.
		// this. 현재 이 클래스에 선언된 이라는 뜻
		for(int i = 0 ; i < scores.length ; i++) {
			
			intKorSum += scores[i].getIntKor();
			intEngSum += scores[i].getIntEng();
			intMathSum += scores[i].getIntMath();
			intMusicSum += scores[i].getIntMusic();
			intSumSum += scores[i].getIntSum(); // 총점의 총점
			intAvgSum += scores[i].getIntAvg(); // 평균의 총점
			
			
			System.out.printf(
					"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getStrName(),
					scores[i].getIntKor(),
					scores[i].getIntEng(),
					scores[i].getIntMath(),
					scores[i].getIntMusic(),
					scores[i].getIntSum(),
					scores[i].getIntAvg()
					);
			
			
		}
		System.out.println(line.do_line(intLineLength));
		System.out.printf(
				"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
				"총점",
				intKorSum,
				intEngSum,
				intMathSum,
				intMusicSum,
				intSumSum, 0
				);
		
		System.out.printf(
				"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
				"평균",
				intKorSum/scores.length,
				intEngSum/scores.length,
				intMathSum/scores.length,
				intMusicSum/scores.length,
				intSumSum/scores.length, 0,
				intAvgSum/scores.length
				);
		System.out.println(line.do_line(intLineLength));

	}

}