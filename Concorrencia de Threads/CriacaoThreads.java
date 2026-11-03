public class CriacaoThreads {
    static class Trabalhadora extends Thread {
        Trabalhadora(String nome) { super (nome); }
        
        @Override
        public void run () {
            System.out.println("Thread: " + getName());
        }
    }
    static class Tarefa implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable: " + Thread.currentThread().getName());
        }
    }
        public static void main(String[] args)
            throws InterruptedException {
                Thread a = new Trabalhadora("heranca");
                Thread b = new Thread(new Tarefa(), "composição");
             a.start();
             b.start();
             a.join();
             b.join();
             System.out.println("Duas tarefas concluidas.");
            }
    }
