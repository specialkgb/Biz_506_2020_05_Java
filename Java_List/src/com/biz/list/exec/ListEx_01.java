/*
 * com.biz.list.* : 3단계 패키지, Base Package
 * com.biz.list.exec : 4단계 패키지, 업무적인 분류를 나타내는 package
 */

package com.biz.list.exec;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		/*
		 * 다른 클래스와 색다르게 선언하는 클래스와
		 * 초기화 하는 생정자의 이름이 다른 형태를 갖는다
		 * 클래스에 <Generic> 키워드를 포함하여 사용을 한다.
		 * Integer형 데이터를 포함할 intList를 선언하고
		 * 초기화 하는 코드
		 * Integer형 리스트라고 부른다.
		 * 자바에서는 기본 배열형 데이터를 사용하는데 어려움이 있어서
		 * 새롭게 JDK에서 제공해주는 도구를 사용하여 많은 갯수의 데이터를 관리하기 위한
		 * 방법을 제공한다.
		 */
		List<Integer> intList = new ArrayList<Integer>();
		// 리스트를 처음 만들면 size() 값이 0인 데이터가
		// 아무것도 없는 리스트가 만들어진다.
		
		
		// Random 클래스를 사용해서 뭔가 수행하기 위한 준비
		// 클래스
		// Random 클래스의 인스턴스(Instance), 객체(object)
		// rnd 인스턴스를 사용가능하도록 초기화 하는 부분
		// new : rnd 인스턴스를 초기화 하겠다.
		// rnd : 생성자(Constructor) method
		Random rnd = new Random();
		// Random 클래스를 사용해서 rnd 인스턴스를 선언하고
		// Random() 생성자를 호출하여
		// rnd 인스턴스를 초기화(새로 만들기 new)하라
		
		intList.add(90); // size() 1인 리스트가 되고 데이터가 1개 추가
		intList.add(100); // 리스트를 데이터 갯수만큼 추가하여 사용
		
		
		for(int i = 0 ; i < 100 ; i ++) {
			int num1 = rnd.nextInt(100) + 1;
			intList.add(num1);
		}
		int sum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			sum += intList.get(i);
					
		}
		
		System.out.println(sum);
		
		
	}

}
