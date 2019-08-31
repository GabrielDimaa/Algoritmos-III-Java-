public class Exer7 {

    public static void main(String[] args) {

        int [][] dimensao = new int[40][40];
        int sorteio;

        for (int j=0; j<40; j++) {
            for (int i = 0; i < 40; i++) {
                sorteio = (int) (Math.random() * 250);
                dimensao[j][i] = sorteio;
                System.out.print(dimensao[j][i] + " ");
            }
            System.out.println();
        }
    }

}
