import java.util.Scanner;
public class Array
{
	public static void main(String[] args) {
	    String[] listademercado = new String[3];
	    listademercado[0] = "maca";
	    listademercado[1] = "banana"; 
	    listademercado[2] = "uva";
	    System.out.println("Você tem " + listademercado[2]);
	    
	    int[] numeros = new int [5];
	    numeros[0] = 10;
	    numeros[1] = 20;
	    numeros[2] = 30;
	    numeros[3] = 40;
	    numeros[4] = 50;
	    
	    int[] numeroslista = {10, 20, 30, 40, 50};
	    System.out.println("Hoje você tem " + numeroslista[0]);
	    System.out.println("Receba " + numeroslista[1]);
	    System.out.println("Concede " + numeroslista[2]);
	    System.out.println("Possua " + numeroslista[3]);
	    System.out.println("objeto " + numeroslista[4]);
	   
	    String[] frutas = {"Maça", "Banana", "laranja", "Uva"};
	    
	    int tamanho = frutas.length;
	    
	    
	    int ultimoIndice = frutas.length - 1;
	    
	    String ultimaFruta = frutas[ultimoIndice];
	    
	    System.out.println("Tamanho do array: " + tamanho);
	    System.out.println("Último índice: " + ultimoIndice);
	    System.out.println("Última fruta: " + ultimaFruta);
	   
	   String[] frutos = {"Maçã", "Banana", "Laranja", "Uva"};
	   
	    for (int i = 0; i < frutos.length; i++) { 
	       System.out.println("Fruta na posição " + i + ": " + frutos [i]); 
	    }
	  // For Each
	  int[] numeros0 = {10, 20, 30, 40, 50};
	    for (int numero : numeros){
	        System.out.println("Número: " + numero);
	    }
	    // Array com Scanner
	    
	    // Cria um objeto scanner para ler a entrada do usuário
	    Scanner scanner = new Scanner(System.in);
	    
	   // Declar a iniciativa para armazenar 5 notas
	   double[] notas = new double[5];
	   
	   System.out.println("Por favor, digite as 5 notas:");
	   for (int i = 0; i < notas.length; i++){
	       System.out.println("Digite a nota " + (i + 1) + ": ");
	       notas[i] = scanner.nextDouble();
	   }
	   scanner.close();
	   
	   System.out.println("\nNotas cadastradas:");
	   for (int i = 0; i < notas.length; i++){
	       System.out.println("Nota " + (i + i) + ": " + notas[i]);
	   }
	   
	    
	}
}
