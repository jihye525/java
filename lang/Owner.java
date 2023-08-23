package api.lang;

public class Owner {
	private String name;
	private String cellPhone;
	
	public Owner() {
		super();
	}

	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Owner) {
			Owner owner = (Owner)obj;
			
			if(this.name.equals(owner.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "이름은 "+this.name+"이고, 핸드폰 번호는 "+this.cellPhone+"입니다.";
	}
	
	
}
