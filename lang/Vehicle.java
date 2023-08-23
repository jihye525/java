package api.lang;

public class Vehicle {
	private Owner owner;
	private int price;
	
	
	public Vehicle() {
		super();
	}


	public Vehicle(Owner owner, int price) {
		super();
		this.owner = owner;
		this.price = price;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Vehicle) {
			Vehicle vehicle = (Vehicle)obj;
			if(this.owner.equals(vehicle.getOwner())) {   //Owner의 equals 메소드가 오버라이딩돼서 이름을 비교하므로 그냥 vehicle의 owner멤버를 매개변수로 넣
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		
		return "소유자 정보 : "+owner+"\n차량정보 : 가격은 " + this.price + "입니다.";
	}
	
	
	
}
