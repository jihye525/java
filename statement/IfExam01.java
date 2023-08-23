package statement;
//5의 배수인지
import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = key.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}	
	}
}
