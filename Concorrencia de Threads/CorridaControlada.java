import java.util.concurrent.CountDownLatch;

public class CorridaControlada {
    private static int total;
    
    public static void main (String[] args)
        throws InterruptedException {
            CountDownLatch leituras = new CountDownLatch(2);
            Runnable tarefa = () -> {
                int copia = total;
                leituras.countDown();
                try {
                    leituras.await();
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                total = copia + 1;
            };
            Thread a = new Thread(tarefa, "A");
            Thread b = new Thread(tarefa, "B");
            a.start();
            b.start();
            a.join();
            b.join();
            System.out.println("Esperado sem perda: 2");
            System.out.println("Obtido com a corrida controlada: " + total);
        }
}
