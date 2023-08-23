package api.lang;
//String클래스의 중요 메소드 살펴보기 - 2
public class StringTest04 {
	public static void main(String[] args) {
		//다 원본 변경 x
		String str1 = new String("java programming");
		String str2 = "재밌다.";
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("test"));
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("ing"));
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.contains(\"java\")=>"+str1.contains("ja"));
		
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.substring(5)=>"+str1.substring(5));
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}
}
