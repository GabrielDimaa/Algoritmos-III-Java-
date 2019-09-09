public class Teste {

    public static void main(String[] args) {

        int inicio, fim, pausa;

        Contagem.contar();
        fim = 1 + (int) (Math.random() * 20);
        Contagem.contar(fim);
        inicio = 1 + (int) (Math.random() * (fim - 1));
        Contagem.contar(inicio, fim);
        pausa = 1 + (int) (Math.random() * 5);
        Contagem.contar(inicio, fim, pausa);

    }

}
