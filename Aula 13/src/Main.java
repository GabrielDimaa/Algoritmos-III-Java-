public class Main {

    public static void main(String[] args) {

        String agencia = new String(), aux;
        int sorteio;

        for (int i=0; i<4; i++) {
            sorteio = (int) (Math.random() * 9);
            aux = Integer.toString(sorteio);
            agencia = agencia + aux;
        }
        System.out.println(agencia);
    }

}
