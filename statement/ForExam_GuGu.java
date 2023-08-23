package statement;

import java.util.Scanner;

// 단을 입력받고 구구단 출력
public class ForExam_GuGu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단 입력: ");
		int num = key.nextInt();
		
		for(int i = 1; i <= 9 ; i ++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}		
	}
}
