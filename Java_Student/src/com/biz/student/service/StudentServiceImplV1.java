package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.Student;

public class StudentServiceImplV1 implements StudentService {

	// 필드변수
	// class Scope의 변수를 선언하기
	// 여기(필드변수 영역)에 선언된 변수는
	// 현재 클래스의 모든 method들이 공유하고, 참조(쓰기, 읽기)가 가능하다.

	// 변수의 Scope.
	// 변수를 선언할 때 어디에 선언하느냐에 따라 변수를 참조할 수 있느냐 없느냐가 결정된다.

	// 필드변수를 선언할 때 접근제한자를 public, private, protected 중에 한가지로
	// 설정할 수 있다.
	// 필드변수를 선언할 때 가급적 public으로 선언하는 것은 지양해야 한다.
	// 필드변수를 public으로 선언해 놓으면 외부에서 필드변수에 직접 접근하여
	// 값을 변형시킬 수 있다. 그러면 예기치 못한 결과를 얻을 수 있다.

	// 필드변수 private으로 선언하는 것은
	// 객체의 캡슐화, 정보은닉 패턴에 적합한 방식이다.
	// 외부에서 접근하지 못하도록 차단하고 현재 클래스의 선언된 method에서만 접근을 허용하는 것이다.
	// 혹시 필드변수를 외부에서 접근할 필요가 있는 경우는 getter, setter를 만든다.

	// 필드변수를 protected로 선언하기
	// protected는 private 접근제한자와 거의 유사한 형태이다.
	// 만약 현재 클래스를 다른 클래스를 만들 때 상속(extends)하여 사용하려고 할 때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아서 사용하고자 할 때는
	// 변수를 protected로 선언한다.

	// 현재 클래스에서는 private처럼 작동하고
	// 상속받은 클래스에서도 마치 자신이 변수를 선언한 것처럼 사용할 수 있게 된다.

	// 현재 클래스를 상속할 수 있도록 생각을 하고 구현을 한다면
	// 필드변수를 protected로 선언을 한다.

	// 만약 private으로 선언을 하게 되면 상속받은 클래스에서 이 변수들을
	// 다시 선언해 주어야 한다.
	protected List<Student> studentList;

	// 클래스 생성자
	// 클래스를 객체(인스턴스)로 만들 때 호출되는 method
	// 클래스를 객체로 생성할 때 1번 호출되는 method로 반드시 생성(초기화)가 필요한
	// 필드변수들을 여기에서 생성하는 코드를 만들어 준다.
	public StudentServiceImplV1() {
		studentList = new ArrayList<Student>();
	}

	public boolean inputStudent() {

		Scanner scan = new Scanner(System.in);

		Student student = new Student();

		System.out.println("번호(END:입력종료) >> ");
		String strNum = scan.nextLine();

		if (strNum.equals("END")) {

			System.out.println("입력값: " + strNum);
			System.out.println("입력 종료");

			return false;
		}

		System.out.println("이름을 입력하세요");
		String strName = scan.nextLine();
		System.out.println("이름: " + strName);

		System.out.println("학년을 입력하세요");
		String strGrade = scan.nextLine();

		int intGrade = 0;
		
		// 유효성 검사
		// 현재 입력된 정보가 정상범위(Validate)에 있는지 검사하여
		// 데이터를 사용할지 말지를 결정하고
		// 입력하는 사용자에게 통보하고 다른 행동을 취할 수 있도록 하는 것.
		// 유효성 검사는 개발자 입장에서는 매우 귀찮은 단순노동일 경우가 많지만
		// 사용자 입장에서는 유효성 검사가 많으면 그만큼 잘못된 데이터를 입력하는 경우를 방지할 수 있다.
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자로 써주세요");
			System.out.println(student.getNum() + "번호부터 다시 입력하세요");
			return false;
		}
		
		if(intGrade < 1 || intGrade >  4) {
			System.out.println("학년은 1 ~ 4 까지만 가능");
			System.out.println(student.getName() + "학생정보를 다시 입력해 주세요");
			return true;
		}

		System.out.println("학과를 입력하세요");
		String strDepth = scan.nextLine();
		System.out.println("학과: " + strDepth);

		student.setNum(strNum);
		student.setName(strName);
		student.setGrade(strGrade);
		student.setDepth(strDepth);
		
		studentList.add(student);
		
		// 제일 끝의 return문은 한 학생의 정보가 모두 정상 입력이 되면
		// true를 return하여 다음 학생 정보를 입력하도록
		// 호출한 곳에 통보(return)해야 하는데 이때 true를 return하도록 해야한다.
		return true;
	}
	

	@Override
	public void studentList() {

		Student student = new Student();
		System.out.println("=========================================");
		System.out.println("학생 정보 일람");
		System.out.println("-----------------------------------------");
		System.out.println("번호\t이름\t학년\t학과");
		System.out.println("-----------------------------------------");

		int size = studentList.size();
		for (int i = 0; i < size; i++) {
			Student sVO = studentList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getName() + "\t");
			System.out.print(sVO.getGrade() + "\t");
			System.out.print(sVO.getDepth() + "\n");

		}
		System.out.println("-----------------------------------------");
	}
}
