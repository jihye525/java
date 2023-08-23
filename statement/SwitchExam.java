package statement;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// 스위치문을 활용해서 A~F학점평가하기
		Scanner key = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = key.nextInt();
		if(score <= 100 & score >= 0) {
			switch(score/10) {
			case 10:
			case 9:
				System.out.println("점수 : " + score + " A학점");
				break;
			case 8:
				System.out.println("점수 : " + score + " B학점");
				break;
			case 7:
				System.out.println("점수 : " + score + " C학점");
				break;
			case 6:
				System.out.println("점수 : " + score + " D학점");
				break;
			default:
				System.out.println("점수 : " + score + " F학점");			
			}
			
		}else {
			System.out.println("잘못입력");
		}
	}
}


