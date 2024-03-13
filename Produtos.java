package estoque;

public class Produtos {

	public String nome;
	public double price;
	public int quantity;

	public double totalValorEstoque() {
		return price * quantity;
	}

	public void addProdutos(int quantity) {
		this.quantity += quantity;
	}

	public void removeProdutos(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " unidades, Total: $ "
		+ String.format("%.2f", totalValorEstoque());
	}
	
}
