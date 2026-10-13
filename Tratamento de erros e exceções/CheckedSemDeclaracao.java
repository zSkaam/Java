import java.io.FileInputStream;

public class CheckedSemDeclaracao {
	public static void main (String [] args) {
		new FileInputStream("nao_existe_aula.txt");
	}
}
