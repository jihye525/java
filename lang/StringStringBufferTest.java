package api.lang;
//String StringBuffer 성능비교
//StringBuffer는 원본 변경이 가능하고 String은 매번 새로운 객체를 만들어야 해서 StringBuffer가 훨씬 빠름 
//사용자가 많은 웹에서는 StringBuffer를 많이 사용
public class StringStringBufferTest {
	//String으로 객체를 만들고 문자열을 추가해서 실행시간 측정하기
	public static void stringCheck(int count) {
		long start = System.nanoTime();
		String str = new String("java");
		for(int i =0; i<=count;i++) {
			str=str+"java";
		}
		long end = System.nanoTime();
		long time = end -start;
		System.out.println("str = str +java");
		System.out.println("실행시간: "+time);
	}
	
	//StringBuffer로 객체를 만들고 문자열을 추가해서 실행시간 측정하기
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer str = new StringBuffer("java");
		for(int i =0; i<=count;i++) {
			str.append("java");
		}
		long end = System.nanoTime();
		long time = end -start;
		System.out.println("str.append(\"java\")");
		System.out.println("실행시간: "+time);
	}
	
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수=>"+count);
		stringCheck(count);
		System.out.println("================");
		stringBufferCheck(count);

	}

}
