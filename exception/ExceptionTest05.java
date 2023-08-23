package exception;
//try~catch~finally
//=> 예외가 발생하거나 발생하지 않거나 반드시 실행해야하는 코드를 정의해야 하는경우 finally블럭에 정의
//=> 자원반납하기
public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 시작");
			System.out.println("디비연동");
			System.out.println("디비처리 진행중.."+10/0);
			System.out.println("완료");
			//System.out.println("자원반납코드");
		}catch(Exception e) {
			System.out.println("오류코드 확인");
			//System.out.println("자원반납코드");
		}finally {
			//예외가 발생하거나 발생하지 않거나 무조건 실행되는 코드
			System.out.println("무조건 실행되는 코드-------------------자원반납코드");
		}

	}

}
