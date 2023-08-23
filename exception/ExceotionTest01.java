package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 프로그램 실행중에 예외가 발생하는 상황
public class ExceotionTest01 {
	public static void main(String[] args) {
		//1. 개발자가 실수할 수 있는 상황
		System.out.println("*******프로그램시작***********");
		//System.out.println(10/0);//ArithmeticException
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
//		String str = null;//NullPointerException
//		str.length();
//		Super obj = new Super();
//		Super obj2 = (Sub)obj; //ClassCastException
//		
		//2.외부요인이나 사용자의 실수로 발생할 수 있는 EXception
//		Scanner key = new Scanner(System.in);
//		System.out.println("값 입력:");
//		int data = key.nextInt();
//		System.out.println("사용자가 입력한 값:"+data); //InputMismatchException
		
		//3. API에서 문법적으로 에외처리를 컴파일타임에 요구하는 경우
		//   => 메소드 선언부에 XXXException을 throws하는 것은 이 메소드를 사용하면서 xxxException이 발생할 수 있다는 의미
		//   => Exception에 대한 처리를 RuntimeExcrption의 하위는 문법적으로 제약하지 않는다
		//      그러나 RuntimeExcrption하위가 아닌 경우는 컴파일시점에서 체크하므로 예외처리를 해야 한다.
		//   => RuntimeExcrption의 하위거나 하위가 아니거나 예외발생 가능성이 있는 코드이므로 무조건 예외처리를 해야 한다.
		try {
			//예외가 발생할 가능성이 있는 메소드를 호출 - 호출하는 곳에서 예외처리
			FileReader f = new FileReader("test.txt");
			System.out.println((char)f.read());
		}catch(FileNotFoundException e) {
			System.out.println("파일경로가 틀림");
			System.out.println("다시선택해");
		}catch(IOException e){
			System.out.println("파일읽기오류발생");
		}
		Integer.parseInt("1234");
		
	}

}
