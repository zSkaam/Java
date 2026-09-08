import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConvertendoStringEmData {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

 System.out.println("Digite uma data no formato dd/MM/yyyy:");
    String dataString = scanner.nextLine();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    try{
        LocalDate dataConvertida = LocalDate.parse(dataString, formatter);
        System.out.println("Data convertida para LocalDate:" + dataConvertida);
        
        String dataFormatadaDisplay = dataConvertida.format(formatter);
        System.out.println("Data formatada para exibição (dd/MM/yyyy):" + dataFormatadaDisplay);
        
    } catch (DateTimeParseException e) {
        System.err.println("Erro ao converter a data. Verifique o formato informado.");
        System.err.println("Detalhes do erro:" + e.getMessage());
    } finally {
        scanner.close();
        }
    }
}
