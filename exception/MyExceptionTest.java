package exception;

import java.util.Scanner;

//사용자 정의 Exception 사용
public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("숫자입력");
		int num = key.nextInt();
		//num이 홀수가 입력되면 예외로 처리 - JVM이 인식하는 예외가 아니지만 예외로 발생싴킨다.
		//throw new 사용자정의예외클래스() 인위적으로 예외를 만든다.
		if(num%2==1) {
			//예외가 발생된 상황
			try {
				throw new MyException("홀수가 입력되었습니다. (error)");
			}catch(Exception e) {
				System.out.println("예외처리완료");
				System.out.println("=============================");
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("정상스텝");
		}
	}

}
