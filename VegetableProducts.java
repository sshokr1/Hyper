

public class VegetableProducts extends Product {
	
	private double count;
	private String expirtdate;

	
	public VegetableProducts(double count, String expirtdate, String name, double price ) {
		super();
		this.count = count;
		this.expirtdate = expirtdate;
		this.name=name;
		this.price=price;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public String getExpirtdate() {
		return expirtdate;
	}

	public void setExpirtdate(String expirtdate) {
		this.expirtdate = expirtdate;
	}

	@Override
	double calculatePrice() {
		
		return count*price;
	}

	@Override
	void printProductDetails() {
	System.out.println("vegtable product : "+name+"\ncount : "+count +"\n expiry date : "+expirtdate+"\n its price: "+price );
		
	}

}
