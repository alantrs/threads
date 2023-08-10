package aula2;

import aula1.TestandoThreads;

public class Main {

    public static void main(String[] args) {

        TestandoThreadsPrioridade thread1 = new TestandoThreadsPrioridade("thread #1", 1000);

        TestandoThreadsPrioridade thread2 = new TestandoThreadsPrioridade("thread #2", 500);

        TestandoThreadsPrioridade thread3 = new TestandoThreadsPrioridade("thread #3", 100);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Programa finalizado");
    }
}
