package duke.choice;

public class ShopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Duke Choice Shop");
		// ex3.1
		Customer c1 = new Customer();
		c1.name = "Pinke";
		System.out.println("Hello " + c1.name);

		//ex 3.2
		double tax = 0.2, total = 0.0;

		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();

		//ex 4.2
		Clothing[] items = {item1, item2};

		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";
		System.out.println("item1 are " + item1.description + " " + item1.size + " " + item1.price);

		total = item1.price + item1.price * tax + 2 * item2.price + 2 * item2.price * tax;

		System.out.println("Total to pay " + total);

		//4.1
		int measurement = 3;
		Customer c2 = new Customer();
		c2.size = "S";

		switch (measurement) {
			case 1: case 2: case 3: c2.size = "S"; break;
			case 4: case 5: case 6: c2.size = "M"; break;
			case 7: case 8: case 9: c2.size = "L"; break;
			default: c2.size = "X";
		}
		System.out.println(c2.size);

	}
}
