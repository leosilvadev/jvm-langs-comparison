package simple.method.call.main.reflection;

import java.lang.reflect.Method;


public class MainJavaReflection {
	
	public static void main(String[] args) {
		run();
	}
	
	private static void run(){
		long init = System.currentTimeMillis();
		
		Double profitPercentage = 20.50;
		
		for(double i=1 ; i<=10000000 ; i++){
			ProductJavaReflection product = new ProductJavaReflection("Product "+i, i, profitPercentage);
			executeSellingPrice(product);
		}

		long end = System.currentTimeMillis();
		long finalTime = end - init;
		System.out.println("Java Reflection Execution");
		System.out.println("Millis: " + finalTime);
	}

	private static void executeSellingPrice(ProductJavaReflection product) {
		try {
			Method method = ProductJavaReflection.class.getMethod("getSellingPrice", null);
			method.invoke(product, null);
			
		} catch (Exception e) { e.printStackTrace(); }
	}
	
}
