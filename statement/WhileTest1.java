package statement;
//While문의 기본 사용 방법
public class WhileTest1 {
	public static void main(String[] args) {
		//while문은 주로 실행 결과 가 true/false인 메소드를 호출하거나 비교 연산자를 이용해서 작업
		//while문의 ()안에서 메소드 호출문이나 연산식을 이용해서 true/false가 반환되도록 식을 만들어야 한다.
		//1부터 10까지 숫자를 출력하기
		int i = 1;
		while(i <= 10) {
			System.out.println("자바프로그램 : " + i);
			i++;
		}
		System.out.println("=================================");
		i = 1;
		while(true) {
			System.out.println("자바프로그램 : " + i);
			if (i == 5) {
				break;
			}
			i++;
		}
	}
}
