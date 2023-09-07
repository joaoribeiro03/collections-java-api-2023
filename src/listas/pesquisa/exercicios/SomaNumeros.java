package listas.pesquisa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> listaDeNumeros;

	public SomaNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}

	public void adicionaNumero(int numero) {
		this.listaDeNumeros.add(numero);
	}

	public int calcularSoma() {
		int total = 0;
		for (Integer n : listaDeNumeros) {
			total += n;
		}
		return total;
	}

	public void exibirNumeros() {
		System.out.println(listaDeNumeros);
	}

	public int encontrarMaiorNumero() {
		int maior = listaDeNumeros.get(0);
		for (Integer n : listaDeNumeros) {
			if (n > maior) {
				maior = n;
			}
		}
		return maior;
	}

	public int encontrarMenorNumero() {
		int menor = listaDeNumeros.get(0);
		for (Integer n : listaDeNumeros) {
			if (n < menor) {
				menor = n;
			}
		}
		return menor;
	}

	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();

		somaNumeros.adicionaNumero(5);
		somaNumeros.adicionaNumero(10);
		somaNumeros.adicionaNumero(15);

		somaNumeros.exibirNumeros();
		System.out.println(somaNumeros.encontrarMaiorNumero());
		System.out.println(somaNumeros.encontrarMenorNumero());

	}

}
