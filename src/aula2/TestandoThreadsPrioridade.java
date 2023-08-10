package aula2;

public class TestandoThreadsPrioridade implements Runnable{

    private String nome;
    private Integer tempo;

    public TestandoThreadsPrioridade(String nome, Integer tempo){
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {

        try {
            for (int i=0; i<6; i++){
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
}
