package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpDate implements Consumer<Product>{

	@Override //vai atualizar o preço em 10%
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);	
	}

}
