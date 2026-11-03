public class ContadorSemSincronizacao {
    static class Contador {
        private int total;
        
        void incrimentar() { total++;}
        int getTotal(){ return total;}
    }
    public static void main (String [] args)
        throws InterruptedException {
            Contador contador = new Contador();
            Runnable tarefa = () -> {
                for (int i = 0; i < 100_000; i++){
                    contador.incrimentar();
            }
        };
        Thread a = new Thread(tarefa,"A");
        Thread b = new Thread(tarefa, "B");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Esperando: 200000");
        System.out.println("Obtido: " + contador.getTotal());
        System.out.println("O resultado pode coincidir com o esperado.");
    }
}
