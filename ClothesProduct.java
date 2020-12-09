
public class ClothesProduct extends Product {

	private String size;
	private String color;
	
	
	
	
	public ClothesProduct(String size, String color,String name, double price) {
		super();
		this.size = size;
		this.color = color;
		this.name=name;
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	double calculatePrice() {
		
		return (size.toLowerCase().equals("xxl")||size.toLowerCase().equals("xxxl")) ? price*1.4:price ;
	}
	@Override
	void printProductDetails() {
		System.out.println("Clothes product "+name+"\n size:  "+size +"\n color "+color+"its price "+price );
		
	}
	
}
