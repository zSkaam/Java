public class Professor extends Pessoa {

	String disciplina;

	public Professor(String nome, int idade, String disciplina) {
		super(nome, idade);
		this.disciplina = disciplina;
	}

	@Override
	void apresentar() {
		System.out.println("Professor: " + nome);
		System.out.println("Disciplina: " + disciplina);
	}
}
