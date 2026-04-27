package product;

public class Main {
	public static void main(String[] args) {
		Product p = new Product();

		Product p1 = p.nhapThongTin("computer", 200, 0.1);
		p.xuatThongTim(p1);
		System.out.println("TaxPrice: " + p1.getTaxPrice());
	}
}
