package aula1;

public class Main {

    public static void main(String[] args) {

        TestandoThreads thread1 = new TestandoThreads("thread #1", 1000);

        TestandoThreads thread2 = new TestandoThreads("thread #2", 500);

        TestandoThreads thread3 = new TestandoThreads("thread #3", 100);

    }
}
