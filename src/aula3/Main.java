package aula3;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        MinhaThreadSoma thread1 = new MinhaThreadSoma("thread #1", array);
        MinhaThreadSoma thread2 = new MinhaThreadSoma("thread #2", array);

    }
}
