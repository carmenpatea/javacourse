package com.demo.all;

import java.util.Arrays;

public class ShopAppAllExercice {

	public static void main(String[] args) {
		System.out.println("Welcome to Duke Choice Shop");
		System.out.println("---------exercise 3.1:------");
		Customer c1 = new Customer("PinkeC1");
		c1.name = "Pinke";
		System.out.println("Hello " + c1.name);

		System.out.println("---------exercise 3.2:------");
		double tax = 0.2, total = 0.0;

		System.out.println("---------exercise 6.3:Static demo----------");
		System.out.println("Min price is " + Clothing.MIN_PRICE);

		System.out.println("TAX Rate is "  + Clothing.MIN_TAX);
		System.out.println();

		Clothing item1 = new Clothing("Blue Jacket",20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

		System.out.println("---------exercise 3.3:------");
		Clothing[] items = {item1, item2, new Clothing("Black Jacket",27.9, "XL"), new Clothing("Red T-Shirt", 55.5, "XS")};

		/*item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";*/
		System.out.println("item1 are " + item1.description + " " + item1.size + " " + item1.price);

		total = item1.price + item1.price * tax + 2 * item2.price + 2 * item2.price * tax;

		System.out.println("Total to pay " + total);

		System.out.println("---------exercise 4.1:------");
		int measurement = 3;
		Customer c2 = new Customer("c2");
		c2.size = "S";

		switch (measurement) {
			case 1:
			case 2:
			case 3:
				c2.size = "S";
				break;
			case 4:
			case 5:
			case 6:
				c2.size = "M";
				break;
			case 7:
			case 8:
			case 9:
				c2.size = "L";
				break;
			default:
				c2.size = "X";
		}
		System.out.println(c2.size);

		System.out.println("---------exercise 4.3:------");
		for ( Clothing item: items) {
			if(c2.getSize().equals(item.getSize())) {
				total = total + item.getPrice();
				System.out.println("Item " + "," + item.getDescription() + ","+ item.getPrice()+"'" + item.getSize());
				if(total >15) { break;}
			}
		}


		System.out.println("-------exercise 5.1: Apply encapsulation---------");
		Clothing item3 = new Clothing("Blue Jacket",9,"M");
		item3.setPrice(9.0);
		System.out.println("Price is 9 with tax  " + item3.getPrice());
		item3.setPrice(10.0);
		System.out.println("Price is 10 wih tax " + item3.getPrice());
		item3.setPrice(11.0);
		System.out.println("Price is 11 with tax  " + item3.getPrice());

		//???????
		for ( Clothing item: items) {
			if(c2.getSize().equals(item.getSize())) {
				total = total + total*tax;
				System.out.println("Total price with tax:  " + total);
				if(total >15) { break;}
			}
		}

		System.out.println("---------exercise 5.2:Oveload a method----------");
		int measurementNew = 5;
		Customer c5 = new Customer("Lucy");
		c5.setName("Lucy");
		c5.setSize("S");
		System.out.println("Customer5 " + c5.getName() + " has size: " + c5.getSize());

		c5.setSize(measurementNew);
		System.out.println("Now Customer5 " + c5.getName() + " has size: " + c5.getSize());

		System.out.println("---------exercise 5.3:Oveload a method----------");

		items[2].setDescription("Black Jacket");
		items[3].setDescription("RED T-Shirt");
		c5.addItems(items);
		c5.setSize(2);
		System.out.println("Customer5 " + c5.getName() + " has totla cost for his clothing: " + c5.getTotalClothingCost());
		for ( Clothing item: c5.getItems()) {
			System.out.println("Clothings " + item.getDescription());
		}

		System.out.println("---------exercise 6.1: Object demo----------");

		Customer newCustomer = new Customer("Pinky",3);
		System.out.println("Now Customer5 " + newCustomer.getName() + " has size: " + newCustomer.getSize());
		System.out.println();

		System.out.println("---------exercise 6.2:Constructor demo----------");
		Clothing item5 = new Clothing("Blue Jacket",20.9, "M");
		System.out.println("New constructor for Item5 " + ": " + item5.getDescription() + ", "+ item5.getPrice()+", " + item5.getSize());
		System.out.println();

		System.out.println("---------exercise 6.3:Static demo----------");
		System.out.println("See top of page: Min price , before declare class Clothing");
		System.out.println("See top of page: TAX Rate ");
		System.out.println();

		System.out.println("---------exercise 7.1: Handling exceptions----------");
		c5.averagePrice(items);
		System.out.println();

		System.out.println("---------exercise 8.1:Abstarct class----------");
		for ( Clothing item: c5.getItems()) {
			System.out.println("Clothings " + item.toString());
		}
		System.out.println();

		System.out.println("---------exercise 8.2:Interface----------");
		Arrays.sort(c5.getItems());
		for ( Clothing item: c5.getItems()) {
			System.out.println("Item output " + item);
		}
		System.out.println();


	}
}
