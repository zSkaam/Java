public class Aluno extends Pessoa { 
    String matricula;
    
    public Aluno (String nome, int idade, String matricula) {
        super (nome, idade);
        this.matricula = matricula;
    }
    
    @Override
    void apresentar() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula " + matricula);
        
    }
}
