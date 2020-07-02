package com.biz.score;

public class ScoreVO {
	/*
	 * 성적처리 과정에서 1학생의 성적을 담는 Object변수 Value Object 라고 한다.
	 */
	private String Num;
	private String Kor;
	private String Eng;
	private String Math;
	private Float Sum;
	private Float Avg;

	public ScoreVO() {

		this.Num = "학번을 입력하세요";
		this.Kor = "국어점수를 입력하세요";
		this.Eng = "영어점수를 입력하세요";
		this.Math = "수학점수를 입력하세요";
	}

	public ScoreVO(String num, String kor, String eng, String math) {
		super();
		Num = num;
		Kor = kor;
		Eng = eng;
		Math = math;

	}

	public String getNum() {
		return Num;
	}

	public void setNum(String num) {
		Num = num;
	}

	public String getKor() {
		return Kor;
	}

	public void setKor(String kor) {
		Kor = kor;
	}

	public String getEng() {
		return Eng;
	}

	public void setEng(String eng) {
		Eng = eng;
	}

	public String getMath() {
		return Math;
	}

	public void setMath(String math) {
		Math = math;
	}

	public Float getSum() {
		return Sum;
	}

	public void setSum(Float sum) {
		Sum = sum;
	}

	public Float getAvg() {
		return Avg;
	}

	public void setAvg(Float avg) {
		Avg = avg;
	}

}