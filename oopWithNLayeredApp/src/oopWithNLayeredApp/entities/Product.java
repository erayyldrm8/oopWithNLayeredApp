package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;

	public Product() {// generate constructor diyip fieldların hepsinin tikini kaldırdık
		super();//silsen bişey olmaz
	}

	public Product(int id, String name, double unitPrice) // generate constructor diyip fieldların hepsinin tikini
						//overloading									// seçtik
	{
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
