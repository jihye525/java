package statement;
//음수 양수 홀수 짝수 구분
import java.util.Random;

public class IfExam02 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		
		if(num>0) {
			System.out.print(num + "은 양수이면서 ");
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println(num + "은 음수입니다.");
			
		}				
	}
}
