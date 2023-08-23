package api.lang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

//POJO(Plain Old Java Object)
public class ObjectTest {
	public static void main(String[] args) {
		//equals는 하위클래스에서 객체의 속성을 비교해서 같은 객체인지 여부를 boolean으로 리턴하도록 재정의해서 사용
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1 ==obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		Person p1 = new Person("BTS","서울",30);
		Person p2 = new Person("BTS","서울",30);

		if(p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//Object클래스의 메소드
		//toString 메소드가 객체의 기본메소드 - 기본메소드는 생략이 가능
		System.out.println(obj1);
		System.out.println(obj1.toString());
		//hashcode는 객체가 할당된 곳의 메모리를 기존으로 값을 계산해서 리턴하므로
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(p1);
		String str = new String("java");
		System.out.println(str);
		Date d = new Date();
		System.out.println(d);
		ArrayList<String> list = new ArrayList<String>();
		list.add("test");
		list.add("java");
		System.out.println(list);
		Random rand = new Random();
		System.out.println(rand);
		
		
		System.out.println(p1.getClass());
	}


}
