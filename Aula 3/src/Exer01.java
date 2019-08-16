public class Exer01 {

    public static void main(String[] args) {
        int i;
        int sorteio;
        int soma=0;

        for (i=0; i<3; i++){
            sorteio = (int) (Math.random() * 6);
            System.out.println(sorteio);
            soma = soma + sorteio;
        }

        System.out.println(+ soma);


    }

}
