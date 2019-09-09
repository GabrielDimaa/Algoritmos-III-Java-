public class Teste {

    public static void main(String[] args) {

        int senha1[] = new int[8];

        senha1 = Senha.gerar();
        for (int i=0; i<8; i++) {
            System.out.print(senha1[i]);
            System.out.print(" ");
        }

    }

}
