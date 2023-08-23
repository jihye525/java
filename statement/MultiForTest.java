package statement;
//For문을 중첩해서 사용하기
public class MultiForTest {

	public static void main(String[] args) {
		for(int row = 1; row <= 5; row++) {
			for(int i = 1; i <= 5; i++) {
				if(i == 3 & row == 3) {
					System.out.print("너");
				}else {
					System.out.print("2");
				}
								
			}
			System.out.println();
		}
	}

}
