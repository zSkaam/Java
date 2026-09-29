public class Main { 
    
    public static void main(String[]args){
        
        Aluno aluno = new Aluno("Carlos", 20, "2026001");
        
        Professor professor = new Professor("Maria", 35, "Java");
        
        aluno.apresentar();
        professor.apresentar();
    }
}
