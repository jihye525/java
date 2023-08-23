package basic;
//String 클래스의 사용
public class APIExam01 {
	public static void main(String[] args) {
	//1. 안녕하세요 라는 문자열을 이용해서 작업하기
	//=> String 클래스를 만들고 문자열의 길이를 출력하기
		String str = new String("안녕하세요");
		int result = str.length();
		System.out.println("문자열의 길이 => " + result);
	
		
	//2. charAt을 호출해서 결과를 출력해보기
		char result2 = str.charAt(2);
		System.out.println("결과 => " + result2);
	}

}
