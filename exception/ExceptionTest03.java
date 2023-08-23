package exception;

import java.util.Scanner;

//While문 사용과 exception처리
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//while문을 사용하는 경우 while문 밖에서 예외처리를 정의하면 예외가 발생하는 경우 반복문이 모두 실행되지 않고 프로그램이 종료
//		try {
//			//예외발생코드
//			int i =10;
//			while(i<=13) {
//				System.out.println("나누기할 숫자:");
//				int num = key.nextInt();
//				System.out.println("값 : "+i/num);
//				i++;
//			}
//		}catch(Exception e) {
//			
//		}
		
		//while문 안에서 예외처리를 정의하면 반복문이 모두 실행된다. : 예외가 발생하는 경우만 catch블럭이 실행
		int i =10;
		while(i<=13) {
			System.out.println("나누기할 숫자:");
			int num = key.nextInt();
			try {
				System.out.println("값 : "+i/num);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나누면 error!!");
			}
			i++;
		
		
		}
	}

}
