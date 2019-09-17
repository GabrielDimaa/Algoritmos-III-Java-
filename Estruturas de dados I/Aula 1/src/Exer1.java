import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        double temperatura[] = new double[7];
        double media;
        double soma=0;
        int cont=0;
        int i;

        Scanner tc = new Scanner(System.in);

        for (i=0; i<7; i++){
            System.out.println("Digite a temperatura do dia " + (i+1) +": ");
            temperatura[i] = tc.nextDouble();
            soma = soma + temperatura[i];
        }

        media = soma / 7;

        for (i=0; i<7; i++){
            if (temperatura[i] > media){
                cont++;
            }
        }

        System.out.println(+ (cont) + "dias estão acima da média");

    }

}
