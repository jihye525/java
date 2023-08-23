package exception;

public abstract class Payment implements Payable{
	protected String shopName;
	protected String productName;
	protected long productPrice;
	
	
	public Payment() {
		super();
	}


	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public abstract void pay() throws PayException;

	
	
}
