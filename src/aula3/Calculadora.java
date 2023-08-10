package aula3;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array){
        soma = 0;

        for(int a : array){
            soma += a;
            System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando o valor " + a + " com total de " + soma);

        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return soma;
    }
}
