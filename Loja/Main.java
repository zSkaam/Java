public class Main {
	public static void main (String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Mouse";
		produto1.preco = 23.40;
		produto1.quantidade = 2;

		Produto produto2 = new Produto();
		produto2.nome = "Teclado";
		produto2.preco = 30.67;
		produto2.quantidade = 3;

		Produto produto3 = new Produto();
		produto3.nome = "Monitor";
		produto3.preco = 30.67;
		produto3.quantidade = 3;



		produto1.exibirDados();
		System.out.println("");
		System.out.println(produto1.calculoTotal());
		System.out.println("_____________________");
		produto2.exibirDados();
		System.out.println("");
		System.out.println(produto1.calculoTotal());
		System.out.println("_____________________");
		produto3.exibirDados();
		System.out.println("");
		System.out.println(produto1.calculoTotal());
	}
}

