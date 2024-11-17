package demo;

import java.io.IOException;
import java.util.List;

import models.Data;
import models.Product;
import parse.ParseData;

public class Demo {
	public static void main(String[] args) throws IOException {
		ParseData parse = new ParseData();
		Data data = parse.getData();
		List<Product> list = data.getListProducts();
		
		list.forEach(l -> System.out.println(l.toString()));
	}
}
