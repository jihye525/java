package statement;
//1~100까지의 합 출력하기
public class ForExam_Hap {
	public static void main(String[] args) {
		int sum = 0;
		int even_sum = 0;
		int odd_sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 2 == 0) {
				even_sum += i;
			}else {
				odd_sum += i;
			}
		}		
		System.out.println("총합 : " + sum);
		System.out.println("짝수합 : " + even_sum);
		System.out.println("홀수합 : " + odd_sum);
	}
}

