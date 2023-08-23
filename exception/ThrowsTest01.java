package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	//throws를 이용해서 예외를 처리
	//=>예외가 직접적으로 발생한 곳에서 처리하지 ㅇ낳고 이 메소드를 호출하는 곳에서 예외를 처리하도록 구현
public class ThrowsTest01 {
	//1. 예외가 발생한 곳에서 처리하기
	public void test(String filename) {
		try {
			FileReader fr = new FileReader(filename);
		}catch(FileNotFoundException e) {
			System.out.println("예외처리 완료");
		}
		
	}
	//2. 예외가 발생한 곳에서 처리하지 않고 호출한 곳에서 예외를 처리하도록 예외를 던진다.
	//메소드 선언부에 명시
	//public 리턴타입 메소드명() throws 예외클래스명1, 예외클래스명2...{
	//}
	public void test2(String filename) throws FileNotFoundException, IOException{
		FileReader fr = new FileReader(filename);
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		
		//A위치에서 호출
		obj.test("test2.txt");
		
		//B위치에서 호출
		obj.test("test3.txt");//test메소드는 예외가 발생한 메소드 네부에서 Exception에 다핸 처리를 했기 때문에
		                      // 호출하는 곳에서는 모두 동일한 방법으로 처리된 결과만 확인이 가능
		
	    
		System.out.println("==================");
		//A위치
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("A가 원하는 유형으로 처리 - 파일을 찾을 수 없습니다. 다시선택?");
		}catch(IOException e) {
			
		}
		
		//B위치
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("B가 원하는 유형으로 처리 - 파일을 찾을 수 업습니다. 프로그램을 종료합니다.");
		}catch(IOException e) {
			
		}
		
		
	}

}
