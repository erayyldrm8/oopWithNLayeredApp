package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {	//data access object
	
	public void add(Product product) {
		//sadece DB erişim kodları buraya yazılacak (SQL)
		
		System.out.println("jdbc ile veritabanına eklendi");
	}
}
