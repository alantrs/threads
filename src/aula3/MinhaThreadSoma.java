package aula3;

public class MinhaThreadSoma implements Runnable{

    private String nome;
    private int[] numeros;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, int[] numeros){
        this.nome = nome;
        this.numeros = numeros;
        Thread t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciada");

        int soma = calculadora.somaArray(numeros);

        System.out.println("O resultado da " +this.nome + " é " + soma);
        System.out.println(this.nome + " finalizada");
    }
}
