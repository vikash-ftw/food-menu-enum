package enumDef;

public enum Menu {
	RICE(100, 10),
	DOSA(120, 8),
	BIRYANI(160, 10),
	SOUP(80, 5),
	COFFEE(70, 20);
	
	private int price;
	private int quantity;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private Menu(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return name().toLowerCase() + " @ "+price;
	}
	
}
