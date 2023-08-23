package exception;
//사용자 정의 예외클래스를 만들기
//=>MyException을  Exception클래스로 만들기 위해서 상속을 해야 한다.
// 클래스를 정의할 때 is a 관계는 상속관계
//               has a 관계는 멤버 변수로 정의
public class MyException extends Exception {
	public MyException(String msg) {
		super(msg); // Exception클래스에 메세지 전달
	}
}
