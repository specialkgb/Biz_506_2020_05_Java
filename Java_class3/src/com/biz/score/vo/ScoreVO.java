package com.biz.score.vo;

public class ScoreVO {
	
	private String StrName;
	private int IntKor;
    private int IntEng;
    private int IntMath;
    private int IntMusic;
    
    private int IntSum;
    private int IntAvg;
	public String getStrName() {
		return StrName;
	}
	public int getIntKor() {
		return IntKor;
	}
	public void setIntKor(int intKor) {
		IntKor = intKor;
	}
	public int getIntEng() {
		return IntEng;
	}
	public void setIntEng(int intEng) {
		IntEng = intEng;
	}
	public int getIntMath() {
		return IntMath;
	}
	public void setIntMath(int intMath) {
		IntMath = intMath;
	}
	public int getIntMusic() {
		return IntMusic;
	}
	public void setIntMusic(int intMusic) {
		IntMusic = intMusic;
	}
	public int getIntSum() {
		return IntSum;
	}
	public void setIntSum(int intSum) {
		IntSum = intSum;
	}
	public int getIntAvg() {
		return IntAvg;
	}
	public void setIntAvg(int intAvg) {
		IntAvg = intAvg;
	}
	public void setStrName(String strName) {
		StrName = strName;
	}
}