import java.util.Scanner;

public class Data {

    public static int getDia(String data) {
        Scanner tc = new Scanner(System.in);
        int dia=0;
        if(isDate(data,"dd/mm/yyyy")){
            String date[]=data.split("/");
            return (Integer.parseInt(date[0]));
        }
        return dia;
    }



    public static int getMes(String data) {
        int mes = 0;
        if (isDate(data, "dd/mm/yyyy")) {
            String date[] = data.split("/");
            return (Integer.parseInt(date[1]));


        }
        return mes;
    }

    public static int getAno(String data) {
        int ano = 0;
        if (isDate(data, "dd/mm/yyyy")) {
            String date[] = data.split("/");
            return (Integer.parseInt(date[2]));

        }
        return ano;
    }
    private static boolean isDate(String data1, String formato1) {
        String[] data = data1.split("/");
        String[] formato = formato1.split("/");

        int checagem = 0;
        for(int i = 0; i < formato.length; i++){
            if(formato[i].length() == data[i].length()){
                checagem++;
            }
        }

        if(checagem == formato.length){
            return true;
        }

        return false;
    }
}