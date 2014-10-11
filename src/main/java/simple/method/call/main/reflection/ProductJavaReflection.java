package simple.method.call.main.reflection;

public class ProductJavaReflection {

	private String name;
	private Double purchasePrice;
	private Double profitPercentage;
	
	public ProductJavaReflection(String name, Double purchasePrice,
			Double profitPercentage) {
		super();
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.profitPercentage = profitPercentage;
	}
	
	public String getName() {
		return name;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public Double getProfitPercentage() {
		return profitPercentage;
	}
	public Double getSellingPrice() {
		return (purchasePrice * profitPercentage) / 100;
	}
	
}
