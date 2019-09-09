import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String data;
        int dia=0;
        int mes=0;
        int ano=0;

        System.out.println("Digite uma data: ");
        data= tc.next();

        dia=Data.getDia(data);
        mes=Data.getMes(data);
        ano=Data.getAno(data);

        System.out.println(dia+"/"+mes+"/"+ano);
    }

}