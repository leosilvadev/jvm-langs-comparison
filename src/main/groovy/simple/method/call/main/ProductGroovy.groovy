package simple.method.call.main

import groovy.transform.CompileStatic;
import groovy.transform.TupleConstructor;
import groovy.transform.TypeChecked;

@CompileStatic
@TypeChecked
class ProductGroovy {

	String name;
	Double purchasePrice;
	Double profitPercentage;
	
	ProductGroovy(){}
	
	ProductGroovy(String name, Double purchasePrice, Double profitPercentage){
		this.name = name
		this.purchasePrice = purchasePrice
		this.profitPercentage = profitPercentage
	}
	
	def getSellingPrice() {
		return (purchasePrice * profitPercentage) / 100;
	}
}
