public class ConversaoTratada {
    public static void main(String [] args) {
        try {
            int idade = Integer.parseInt ("vinte");
            System.out.println("Idade: " + idade);
        } catch (NumberFormatException e) {
            System.out.println("Informe uma idade inteira.");
            System.out.println(e.getClass().getSimpleName());
        }
        System.out.println("Programa continua.");
    }
}
