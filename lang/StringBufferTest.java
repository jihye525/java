package api.lang;
//String은 원본이 변경되지 않고 String메소드의 호출결과가 새로운 String객체로 만들어져서 리턴된다.
//""로 연결되는 조작이 빈번한 겨우 문자열이 지속적으로 바뀌므로 상수풀에 계속 객체가 만들어진다.
//문자열 조작이 자주발생하는 경우 StringBuffer나 StringBuilder룰 이용해서 작업
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sbu = new StringBuilder("java programming");
		
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbu);
		
		//문자열 붙이기
		sb.append("재밌다");
		sbu.append("재밌다.");
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbu);
		
		//문자열 중간에 삽입
		sb.insert(2, "suvlet");
		sbu.insert(5, "jsp");
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbu);
		
		//문자열 삭제
		sb.delete(2,5);//start ~end-1 (2~4)
		sbu.delete(4,  8);//4~7
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbu);
		
		//문자열 거꾸로 변경
		sb.reverse();
		sbu.reverse();
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbu);
		
	}
}
