package statement;

public class WhileExam1_Hap {
	public static void main(String[] args) {
		int sum = 0;
		int even_sum = 0;
		int odd_sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			if(i % 2 == 0) {
				even_sum += i;
			}else {
				odd_sum += i;
			}
			i++;
		}
		System.out.println("총합 : " + sum);
		System.out.println("짝수 합 : " + even_sum);
		System.out.println("홀수 합 : " + odd_sum);
	}
}
