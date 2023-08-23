package statement;

import java.util.Scanner;

public class MultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = key.nextInt();
		
		if(score > 100 | score < 0) {
			System.out.println("잘못 입력");
		}else if(score >= 90) {
			System.out.println("점수: " + score + "A 학점");
		}else if(score >= 80) {
			System.out.println("점수: " + score + "B 학점");
		}else if(score >= 70) {
			System.out.println("점수: " + score + "C 학점");
		}else if(score >= 60) {
			System.out.println("점수: " + score + "D 학점");
		}else{
			System.out.println("점수: " + score + "F 학점");
		}
    }
}


/*
 *      if(score <= 100 & score >= 0){
 *          if(score >= 90) {
				System.out.println("점수: " + score + "A 학점");
		    }else if(score >= 80) {
				System.out.println("점수: " + score + "B 학점");
			}else if(score >= 70) {
				System.out.println("점수: " + score + "C 학점");
			}else if(score >= 60) {
				System.out.println("점수: " + score + "D 학점");
			}else{
				System.out.println("점수: " + score + "F 학점");
			}
 *      }else{
 *      	System.out.println("잘못입력");
 *      }
 */
