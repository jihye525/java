package api.lang;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	//지불금액이 내 잔액보다 <= , 카드번호가 일치
	//무조건 문자열의 비교는 equals메소드를 이용해서 비교한다.
	public void pay(long amount,String	cardNo) {
		if(this.cardNo.equals(cardNo) & getBalance()>=amount) {  //String에서 주의할 점 .equals로 문자열 비교해야함 아니면 주소끼리 비교가 돼서 X
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다");
		}
	}
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
