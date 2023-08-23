package statement;
//이중 For문 연습하기
public class MultiForExam2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 25; i = i + 5) {
			for(int j = 0; j <= 4; j ++) {
				System.out.print((i + j) + "\t");
			}
			System.out.println();
		}
	}

}
/*
 * int num = 1;
 * for(int i = 1; i <= 5; i++){
 *     for(int j = 1; j <= 5; j++){
 *     System.out.print(num);
 *     num++;
 *     }
 * }
 *     
 */

