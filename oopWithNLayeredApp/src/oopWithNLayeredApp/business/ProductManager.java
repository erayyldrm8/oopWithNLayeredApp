package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product; //bu paket ve sınıftan nesne kullanıyoruz, o yüzden imprt ettik

public class ProductManager {
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {	//ProductManager new len diğinde bana productDao ver
		
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {// product db nesnesi response request pattern'i
														// olacak ileride
		// iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10' dan küçük olamaz");//hata fırılatılırsa uygulama lesilir
		}
		/*JdbcProductDao productDao= new JdbcProductDao();
		productDao.add(product);*/
		
		/*HibernateProductDao hibernateProductDao=new HibernateProductDao();
		hibernateProductDao.add(product);*/
		
		//ProductDao productDao=new JdbcProductDao();
		productDao.add(product);
			
	}
}
