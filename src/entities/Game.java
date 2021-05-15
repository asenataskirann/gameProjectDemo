package entities;

public class Game  {
	private int id;
	private String Name;
	private int unitPrice;
	private int unitStock;
	
	public Game() {}
	
	public Game(int id, String name, int unitPrice, int unitStock) {
		super();
		this.id = id;
		this.Name = name;
		this.unitPrice = unitPrice;
		this.unitStock = unitStock;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int  unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}
	

}
