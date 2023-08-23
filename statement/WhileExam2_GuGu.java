package statement;

import java.util.Scanner;

public class WhileExam2_GuGu {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = key.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			i++;
		}
	}
}
