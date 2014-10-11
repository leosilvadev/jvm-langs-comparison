package simple.method.call.main;


public class MainJava {
	
	public static void main(String[] args) {
		long init = System.currentTimeMillis();
		
		Double profitPercentage = 20.50;
		
		for(double i=1 ; i<=10000000 ; i++){
			ProductJava product = new ProductJava("Product "+i, i, profitPercentage);
			product.getSellingPrice();
		}

		long end = System.currentTimeMillis();
		long finalTime = end - init;
		System.out.println("Java Execution");
		System.out.println("Millis: " + finalTime);
	}
	
}
