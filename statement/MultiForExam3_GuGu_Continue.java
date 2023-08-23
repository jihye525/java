package statement;
//구구단
public class MultiForExam3_GuGu_Continue {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			if(i == 5) {
				continue;
			}
			for(int j = 1; j <= 9 ; j++) {
				/*
				 * if(i == 5) { continue; }
				 */
				System.out.print(i + "*" + j + "=" + i*j +"\t");
			}
			System.out.println();
		}

	}

}
