package listas.operacoesbasicas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		this.itemList.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!itemList.isEmpty()) {
			for (Item t : itemList) {
				if (t.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(t);
				}
			}
			itemList.removeAll(itensParaRemover);
		} else {
			System.out.println("Não ha itens a ser removidos");
		}

	}

	public double calcularValorTotal() {
		double total = 0.0;
		for (Item i : itemList) {
			if (i.getPreco() > 0 && i.getQuantidade() > 0) {
				total += i.getPreco() * i.getQuantidade();
			}
		}
		return total;
	}

	public void exibirItens() {
		System.out.println(itemList);
	}

	public static void main(String[] args) {

		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adicionarItem("Vinho", 50.0, 5);
		carrinhoDeCompras.adicionarItem("Feijao", 15.50, 3);
		carrinhoDeCompras.adicionarItem("Miojo", 2.50, 4);

		System.out.printf("O valor total da compra e %.2f\n", carrinhoDeCompras.calcularValorTotal());

		carrinhoDeCompras.exibirItens();

		carrinhoDeCompras.removerItem("Miojo");

		carrinhoDeCompras.exibirItens();

	}
}
