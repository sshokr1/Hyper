
public class ElectronicProduct extends Product {

	private String type;
	private String brandName;
	
	
	public ElectronicProduct(String type, String brandName, String name, double price ) {
		super();
		this.type = type;
		this.brandName = brandName;
		this.name=name;
		this.price=price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	double calculatePrice() {
		return price;
	}

	@Override
	void printProductDetails() {
		System.out.println("electronic product "+name+"\ntype:  "+type +"\n brand name "+brandName+"its price "+price );
		
	}

}

