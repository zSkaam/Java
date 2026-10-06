 public class Main {
     public static void main (String[] args) {
         Conta[] contas = {
             new ContaCorrente("Ana", 100.0),
             new ContaPoupanca("Bruno", 100.0)
         };
         for (Conta conta : contas) {
             conta.depositar(50.0);
             conta.sacar(30.0);
             System.out.println(Conta.getTitular() + " - saldo: " + conta.getSaldo());
         }
     }
 }
