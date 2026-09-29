public class Professor extends Pessoa{
    
    String disciplina;
    
    public Professor(String nome, int idade, String disciplina){
        
        super(nome, idade);
        
        this.disciplina = disciplina;
        
    }
}
