package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override //testando o Product p em boolean
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
