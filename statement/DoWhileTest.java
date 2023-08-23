package statement;

public class DoWhileTest {
	public static void main(String[] args) {
		int i = 10;
		//while문은 조건이 만족하지 않으면 블럭 안의 명령문을 한 번도 실행하지 않는다.
		while(i < 10){
			System.out.println("while문처리");
			i++;
		}
		//do~while문은 조건이 만족하지 않아도 한 번은 블럭 안의 코드가 실행된다.
		do {
			System.out.println("dowhile문처리");
			i++;
		}while(i < 10);	
	}
}
