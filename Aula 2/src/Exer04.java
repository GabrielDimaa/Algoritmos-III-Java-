import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        double idade;
        double AnosContrib;
        String sexo = new String();

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = tc.nextDouble();
        System.out.println("Digite seus anos de contribuição: ");
        AnosContrib = tc.nextDouble();
        System.out.println("Digite seu sexo: ");
        sexo = tc.next();

        if (sexo.intern() == "feminino"){
            if (idade >= 60 || AnosContrib >= 30){
                System.out.println("Você já tem o direito a aposentadoria");
            }
            else{
                System.out.println("Anos em contribuição que faltam: " + (30 - AnosContrib));
            }
        }

        else if (sexo.intern() == "masculino"){
            if (idade >= 65 || AnosContrib >= 35){
                System.out.println("Você já tem o direito a aposentadoria");
            }
            else{
                System.out.println("Anos em contribuição que restam: " + (35 - AnosContrib));
            }
        }

    }

}