package statement;

import java.util.Scanner;

//if~else if ~ else구문
//하나의 변수가 여러 조건을 갖을 때 사용
//여러 개의 변수를 평가해야 할 때 or 하나의 변수가 여러 개의 조건을 갖을 때는 X 
public class MultiIfTest {

	public static void main(String[] args) {
		// 주민번호의 입력받고 남자, 여자, 기타 출력하기
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		int ssn = key.nextInt();
		if(ssn == 1 | ssn == 3) {
			System.out.println("남자");
		}else if(ssn == 2 | ssn == 4) {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}	
	}
}
