package statement;
//for기본을 연습
public class ForTest {
	public static void main(String[] args) {
		System.out.println("시작");	

	    for(int i = 1; i <= 5; i++) {
			System.out.println("자바프로그램 : " + i);
		}
		System.out.println("===============================");
		
		for(int i = 10; i <= 15; i = i + 2) {
			System.out.println("자바프로그램 : " + i);
		}
		System.out.println("===============================");
		for(int i = 10; i >= 1; i--) {
			System.out.println("자바프로그램" + i);
		}
		System.out.println("===============================");
	}
}
