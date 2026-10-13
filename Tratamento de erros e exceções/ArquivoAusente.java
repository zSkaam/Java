import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArquivoAusente {
    public static void main (String [] args)
    throws FileNotFoundException {
        new FileInputStream("nao_existe_aula.txt");
        System.out.println("Arquivo aberto");
    }
}
