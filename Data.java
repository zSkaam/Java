import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[]args) {
    LocalDate dataOriginal = LocalDate.of(2023, 10, 27);

 DateTimeFormatter formatadorPadraoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 String dataFormatada = dataOriginal.format(formatadorPadraoBrasil);
 
 System.out.println("Data original;" + dataOriginal);
 System.out.println("Data formatada:" + dataOriginal);
 System.out.println("Data formatada (dd/MM/yyyy):" + dataFormatada);
    }
}
