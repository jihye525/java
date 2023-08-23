package api.lang;
//String 클래스의 중요 메소드 살펴보기  - 1
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = "재밌다.";
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);  //문자열 조작이 많이 일어나는 웹환경에서는 스트링이 적절하지 않음 계속 새로운 객체를 만들어야하기떄문에
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.lastIndexOf('합')=>"+str1.lastIndexOf('합'));
		System.out.println("str1.length()=>"+str1.length());
		
		System.out.println("str1.equals(\"java programing\")=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"java programing\")=>"+str1.equals("Java programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"java programing\")=>"+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"java programing\")=>"+str1.equalsIgnoreCase("Java programming"));
	}

}
