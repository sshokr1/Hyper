import javax.swing.JOptionPane;

public class HuperSystem {

	public static void main(String[] args) {
		
		boolean validEntry = false ;
		boolean validProductSelection = false ;
		


		Product [] products = new Product [1];
		
		
		
	String userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new product \n - to remove product "
			+ "\n # to print all product ");	
		
	while (!validEntry) {
	
		
	
	
	
	switch (userEntry) {
	case "+":
		
		String productCountString = JOptionPane.showInputDialog("please enter products number" );
		int productCount = Integer.parseInt(productCountString);
		 products = new Product [productCount];
		 String name = "";
		 double price= 0.0;
		 String priceString ="";
		 for (int i = 0; i < products.length; i++) {
				validEntry = true ;
				String productType = 	JOptionPane.showInputDialog("to add Vegetables Please  "
						+ "enter 1 \n to add electronics Please enter 2 \n to add clothes enter 3 \n");
	
				
				switch (productType) {
				case "1":
				
					 name = JOptionPane.showInputDialog("please enter peoduct name ");
					 priceString = JOptionPane.showInputDialog("please enter product price ");
					 price = Double.parseDouble(priceString);
					String countString = JOptionPane.showInputDialog("please enter product count ");
					double count = Double.parseDouble(countString);
					String expirtdate = JOptionPane.showInputDialog("please enter expiry date  ");
					

					Product vegetables = new VegetableProducts(count, expirtdate, name, price);
					products [i]= vegetables;
					break;
					
			case "2":
				
		
				
				String type = JOptionPane.showInputDialog("please enter product type ");
				String brandName = JOptionPane.showInputDialog("please enter brand name  ");
				 name = JOptionPane.showInputDialog("please enter product name ");
				 priceString = JOptionPane.showInputDialog("please enter product price ");
				 price = Double.parseDouble(priceString);
				

				Product electronics = new ElectronicProduct(type, brandName, name, price);
				products [i]= electronics;
					break;
					
					
			case "3":
			
				 name = JOptionPane.showInputDialog("please enter peoduct name ");
				 priceString = JOptionPane.showInputDialog("please enter product price ");
				 price = Double.parseDouble(priceString);
				String size = JOptionPane.showInputDialog("please enter product size ");
				String color = JOptionPane.showInputDialog("please enter color  ");
				

				Product clothes = new ClothesProduct(name, color, size, price);
				products [i]= clothes;
				
				break;

				default:
					validProductSelection = false;
					productType =	JOptionPane.showInputDialog("please to add vegtables "
							+ "enter 1 \n to add electronics enter 2 \n to add clothes enter 3 \n");
					break;
				}
				}

		 userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new product \n - to remove product "
					+ "\n # to print all product ");	
		 validEntry = false ;
		break;
		
case "-":
	validEntry = true ;
	if (products.length >0 )
		products [products.length -1]= null ;
	else
		
		JOptionPane.showMessageDialog(null, "there are no products" );

	
	 userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new product \n - to remove product "
				+ "\n # to print all product ");	
	 validEntry = false ;
	
		break;
		
		
case "#":
	validEntry = true ;
	if (products.length >0 ){
		for (int j = 0; j < products.length; j++) {
			products[j].printProductDetails();
		}
	}

	else{
		

		JOptionPane.showMessageDialog(null, "there are no products" );
	}
	break;

	default:
		validEntry = false;
		userEntry = JOptionPane.showInputDialog( "please choose from below  \n  Please type (+) to add new product \n Please type(-) to remove product "
				+ "\n Please type (#) to print all product ");
		break;
	}	
		
	}	
	}
	
}

