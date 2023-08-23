package api.lang;


public class Person {
	private String name;
	private String addr;
	private int age;
	public Person() {
		
	}

	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {   
		//obj.  //Person의 멤버접근 X
		//obj의 타입이 Person클래스 타입인지 검사
		if(obj instanceof Person) {
			//객체의 값을 비교해야 하기 때문에 Person의 멤버를 액세스해야한다.
			//obj. //Person의 멤버접근 가능 높은 버전에서는 가능하지만 낮은 버전은 안되므로 캐스팅해줘야함
			Person p = (Person)obj;
			//p.addr  //객체수준이 아니라 클래스수준에서 검사하므로 private이여도 접근 가능
			//객체의 모든 값들을 비교
			if(this.name.equals(p.name)&this.addr.equals(p.addr)&this.age == p.age) {
				return true;
			}		
		}
		return false;
	}

	
	
	public void setName(String name) {		
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}
