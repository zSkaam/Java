public class Produto {

	String nome;
	int quantidade;
	double preco;

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
	}

	public double calculoTotal() {
		return preco * quantidade;
	}
}
