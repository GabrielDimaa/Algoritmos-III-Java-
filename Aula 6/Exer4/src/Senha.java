public class Senha {

    static int[] gerar() {

        int senha[] = new int[8];

        for (int i=0; i<8; i++) {
            senha[i] = 1 + (int) (Math.random() * 10);
        }
        return (senha);

    }

}
