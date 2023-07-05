package ExercisioNumerodSegundaTentativa;

public class OrderItem {

	private Integer quantity;
	private double price;
	
	private Produto product;

	public OrderItem(Integer quantity, double price, Produto product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Produto getProduct() {
		return product;
	}

	public void setProduct(Produto product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	//faz a subscrição
	@Override
	public String toString() {
		return getProduct().getName()
		+", $"		
		+String.format("%.2f", price)
		+" Quantity: "
		+ quantity
		+ String.format("%.2f", subTotal());
		
	}
	
	
}
