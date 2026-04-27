package product;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, double tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product p = new Product(name, price, tax);
		return p;
	}

	public void xuatThongTim(Product p) {
		System.out.println("Name: " + p.getName());
		System.out.println("Price: " + p.getPrice());
		System.out.println("Tax: " + p.getTax());

	}

	public double getTaxPrice() {
		return getPrice() * getTax();
	}
}
