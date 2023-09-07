package set.operacoesbasicas.exercicios;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasSet = new HashSet<>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(palavrasSet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavrasSet, other.palavrasSet);
	}

	public void adicionarPalavra(String palavra) {
		palavrasSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		String palavraParaRemover = null;
		for (String p : palavrasSet) {
			if (p == palavra) {
				palavraParaRemover = palavra;
				break;
			}
		}
		palavrasSet.remove(palavraParaRemover);
	}

	public boolean verificarPalavra(String palavra) {
		for (String p : palavrasSet) {
			if (p.equals(palavra)) {
				return true;
			}
		}
		return false;
	}

	public void exibirPalavrasUnicas() {
		System.out.println(palavrasSet);

	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		// Adicionando linguagens únicas ao conjunto
		conjuntoLinguagens.adicionarPalavra("Java");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("JavaScript");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("C++");
		conjuntoLinguagens.adicionarPalavra("Ruby");

		conjuntoLinguagens.exibirPalavrasUnicas();

		conjuntoLinguagens.removerPalavra("Python");
		conjuntoLinguagens.exibirPalavrasUnicas();

		conjuntoLinguagens.removerPalavra("Swift");

		System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
		System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

		conjuntoLinguagens.exibirPalavrasUnicas();

	}
}
