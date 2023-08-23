package exception;
//자바에서 예오처리를 하는 방법 : try~catch블럭
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try블럭시작");
			System.out.println(10/0);
			System.out.println("try블럭종료");
		}catch(ArithmeticException e) {
			//예외가 발생하면 처리할  문장을 구현
			//Exception이 발생하지 않으면 catch블럭이 실행되지 않는다.
			System.out.println("예외발생");
			System.out.println("예외 메세지 => "+e.getMessage());
			//예외를 추적해서 화면에 라인넘버까지 출력하므로 개발시에 많이 사용된다.**
			e.printStackTrace();
		}

	}

}
