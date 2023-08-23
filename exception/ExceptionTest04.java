package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch 사용하기
//예외처리 : try~catch~catch ...
//=> 각각의 예외가 발생할때마다 다르게 처리하고 싶은 경우 catch블럭이 여러 개 선언해서 사용할 수 있다.
// 단, 상위의 exception은 가장 아래에 정의한다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = null;
		try {
			System.out.println("시작");
			System.out.println("숫자입력");
			int num1 = key.nextInt();
			System.out.println("나눌숫자입력:");
			int num2 = key.nextInt();
			System.out.println("결과 =>"+(num1/num2));
			System.out.println(str.length());
			System.out.println("종료");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지마..");
		}catch(InputMismatchException e) {
			System.out.println("문자 입력하지마...");
		}catch(Exception e) {
			System.out.println("예측하지 못한 예외 발생");
		}

	}

}
