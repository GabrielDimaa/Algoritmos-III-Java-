public class Exer03 {

    public static void main(String[] args) {

        int sorteio;
        int resultado;
        int i;

        sorteio = (int) (Math.random() * 5);
        resultado = sorteio + 5;
        System.out.println("Caracteres da senha: " + resultado);

        System.out.println("Senha: ");
        for (i=0; i<resultado; i++) {
            sorteio = (int) (Math.random() * 9);
            System.out.print(sorteio);
        }





    }

}
