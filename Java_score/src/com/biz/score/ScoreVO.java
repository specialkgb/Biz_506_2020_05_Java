package com.biz.score;

public class ScoreVO {

	private int stNum;
	private int stKor;
	private int stEng;
	private int stMath;
	private int stSum;
	private int stAvg;

	public ScoreVO() {

		this.stNum = 0;
		this.stKor = 0;
		this.stEng = 0;
		this.stMath = 0;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getStKor() {
		return stKor;
	}

	public void setStKor(int stKor) {
		this.stKor = stKor;
	}

	public int getStEng() {
		return stEng;
	}

	public void setStEng(int stEng) {
		this.stEng = stEng;
	}

	public int getStMath() {
		return stMath;
	}

	public void setStMath(int stMath) {
		this.stMath = stMath;
	}

	public int getStSum() {
		return stSum;
	}

	public void setStSum(int stSum) {
		this.stSum = stSum;
	}

	public int getStAvg() {
		return stAvg;
	}

	public void setStAvg(int stAvg) {
		this.stAvg = stAvg;
	}

}
