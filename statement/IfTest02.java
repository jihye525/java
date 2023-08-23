package statement;

import java.util.Scanner;

//if~else제어구문
//
public class IfTest02 {
	public static void main(String[] args) {
		//점수 입력을 Scanner로 받아서 90 이상은 pass , 나머지는 fail이 되도록 작업하기
		//단, 점수가 0보다 작거나 100보다 크면 "잘못입력"
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = key.nextInt();		
		if(score < 0 | score > 100) {
			System.out.println("잘못입력");
		}else {
			if(score >= 90) {
			System.out.println("pass");
			}else {
			System.out.println("fail");
			}
		//=========================================
			
		if(score >=0 & score <= 100) {
			if(score >= 90) {
				System.out.println("pass");
				
			}else {
				System.out.println("fail");
			}
		}else {
			System.out.println("잘못입력");
		}
		
		}

	}

}
