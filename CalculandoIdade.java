import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculandoIdade {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoString = scanner.nextLine();
        
        try{
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);
            LocalDate dataAtual =  LocalDate.now();
            
            Period idade = Period.between(dataNascimento, dataAtual);
            
            System.out.println("Sua data de nascimento:" + dataNascimento.format(formatter));
            System.out.println("Data atua:" + dataAtual.format(formatter));
            System.out.println("Sua idade é:" + idade.getYears()+ "anos.");
            
        
        } catch (DateTimeParseException e) {
            System.err.println("Erro: Formato de data inválido. Use dd/MM/yyyy.");
            System.err.println("Detalhes do erro:" + e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
        
