package aula1;

public class TestandoThreads implements Runnable {

    private String nome;
    private Integer tempo;

    public TestandoThreads(String nome, Integer tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){

        for(int i = 0; i < 6; i++){
            System.out.println(nome + " contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
