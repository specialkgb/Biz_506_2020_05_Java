package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	private List<ScoreVO> scoreList;
	private List<StudentVO> studentList;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		studentList = new ArrayList<StudentVO>();
	}

	public void inputStudent() {
		String studentFile = "src/com/biz/student/service/student.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				students = reader.split(":");

				StudentVO vo = new StudentVO();
				vo.setNum(students[SplitPos.STUDENT.ST_NUM]);
				vo.setName(students[SplitPos.STUDENT.ST_NAME]);
				studentList.add(vo);

			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void inputScore() {
		String studentFile = "src/com/biz/student/service/score.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				students = reader.split(":");

				ScoreVO vo = new ScoreVO();
				vo.setNum(students[0]);
				vo.setKor(Integer.valueOf(students[SplitPos.STUDENT.ST_NAME]));
				vo.setEng(Integer.valueOf(students[2]));
				vo.setMath(Integer.valueOf(students[3]));
				scoreList.add(vo);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void calcSum() {
		int d = 0;
		int b = 0;
		int c = 0;
		for (ScoreVO a : scoreList) {
			d = a.getKor();
			b = a.getEng();
			c = a.getMath();
			a.setSum(b + c + d);
		}
	}

	@Override
	public void calcAvg() {
		for (ScoreVO a : scoreList) {
			a.setAvg((float) (a.getSum()) / 3f);
		}
	}

	public void studentList() {
		System.out.println("=======================================");
		System.out.println(" 학생성적 일람표 ");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		System.out.println();

		for (StudentVO a : studentList) 
		{
			for (ScoreVO stVO : scoreList) {
				if (a.getNum().equals(stVO.getNum())) 
				{
					System.out.print(a.getName() + "\t" + a.getNum() + "\t" + stVO.getKor() + "\n");
					break;
				}
			}
		}
	}
}