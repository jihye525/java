package api.lang;

//Wrapper클래스들은 기본형데이터를 참조형으로 변환할 수 있는 클래스
//=>Wrapper클래스의 오토박싱 언박싱에 대한 개념
public class WrapperTest {
	public static void main(String[] args) {
		// 5.0이전
		int i = 10;
		// 기본형데이터를 참조형으로 변환
		Integer in = new Integer(i); // deprecated-이제는 안쓴다 지양해달라
		test(i);
		
		// 5.0이후		
		int j = 10;
		Integer in2 = j;   //원래 참조형은 new로 생성이 가능한데 wrapper클래스도 가능하게 변경
							//5.0이후 버전의 jdk에서 컴파일러가 자동으로 변환해준다.
							//참조형 타입의 변수를 요구하는 메소드에 기본형 데이터를 전달해도 자동으로 
							//Integer in = new Integer(j)와 같은 코드를 실행해준다.
							//이를 오토박싱
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

	public static void test(Object obj) {
		//5.0이전버전
		//Object -> Integer 변환
		Integer in = (Integer) obj;
		//Integer를 다시 int로 변환
		int myoldval = in.intValue();
		System.out.println("5.0이전버전: "+ myoldval);
		
		//5.0이후
		int val = (Integer)obj;// int형 변수에 참조형 변수를 전달하는 경우
								//컴파일러가 자동으로 객체로 포장된 값을 기본형으로 변환해서 전달
								//오토언박싱
		System.out.println("5.0이후버전:"+val);
		System.out.println("5.0이전버전:"+obj);
	}
	
}
