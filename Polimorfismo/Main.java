public class Main { 
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Aluno("Carlos", 20, "2026001");
        
        Pessoa pessoa2 = new Professor("Maria", 35, "Progamação Java");
        
        pessoa1.apresentar();
        System.out.println();
        pessoa2.apresentar();
    }
}
