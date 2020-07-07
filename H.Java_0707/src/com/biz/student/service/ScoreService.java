package com.biz.student.service;

public interface ScoreService {
	
	public void inputStudent(); // student.txt 파일을 읽어서 studentList를 작성
	public void inputScore(); // score 파일을 읽어서 scoreList를 작성
	
	public void calcSum(); // 총점 계산
	public void calcAvg(); // 평균 계산
	
	public void studentList();

}