package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.Student;

public class StudentServiceImplV5 extends StudentServiceImplV2 {
	public StudentServiceImplV5() {
		outPut = System.out;
	}

	/*
	 * student.txt 파일을 읽어서 studentList에 저장하고
	 * student_list.txt 파일에 학생명부 출력
	 * 
	 * inputStudent method를 변경하여
	 * 전공이 컴퓨터 공학인 학생들만 리스트를 추출하시오
	 */

	@Override
	public boolean inputStudent() {

		String studentFile = "src/com/biz/student/exec/student.txt";

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
			
				String[] students = reader.split(":");
				
				Student sVO = new Student();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade((students[2]));
				sVO.setDepth(students[4]);
				
				String ct = sVO.getDepth();
				if (ct.equals("컴퓨터공학")) {				
					studentList.add(sVO);
				}
				
				
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}
}