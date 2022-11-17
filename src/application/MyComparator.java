package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override //vai comparar 2 produtos
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
