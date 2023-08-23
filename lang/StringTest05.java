package api.lang;
//String클래스의 메소드를 이용한 데이터 변환
public class StringTest05 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle html5 css javascript jquery");
		//1. String -> byte[]
		byte[] data1 = str1.getBytes();
		for(byte b : data1) {
			System.out.println(b);
		}
		
		//2. String -> char[]
		char[] data2 = str1.toCharArray();
		for(char val : data2) {
			System.out.println(val);
		}
		System.out.println();
		//3.String -> String[]
		String[] data3 = str2.split(" ");
		for(String val : data3) {
			System.out.println(val);
		}
		
		//4. 기본형 -> String
		int i =1000;
		test(String.valueOf(i));
		double d = 10.5;
		test(String.valueOf(d));
		test(""+i);
		test(""+d);      //String+__  -> String
	}
	public static void test(String data) {
		System.out.println("전달받은 데이터 ===>"+data);
	}
	
}
