package simple.method.call.main

class MainGroovy {
	
	static main(args){
		run()
	}
	
	static run(){
		long init = System.currentTimeMillis();
		
		Double profitPercentage = 20.50;
		
		for ( i in 1..10000000 ) {
//			ProductGroovy product = new ProductGroovy(name: "Product ${i}", purchasePrice: i, profitPercentage: profitPercentage)
			ProductGroovy product = new ProductGroovy("Product ${i}", i, profitPercentage)
			product."sellingPrice"
		}
		
		long end = System.currentTimeMillis();
		long finalTime = end - init;
		System.out.println("Java Dynamic Execution - Dynamic Constructor");
		System.out.println("Millis: " + finalTime);
	}
	
}