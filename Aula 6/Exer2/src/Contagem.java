class Contagem {


    static void contar() {

        for(int i=1; i<11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


    static void contar(int fim) {

        for(int i=1; i<(fim+1); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void contar(int inicio, int fim) {

        for(int i=inicio; i<(fim+1); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void contar(int inicio, int fim, int pausa) {

        for(int i=inicio; i<(fim+1); i++) {
            try { Thread.sleep (pausa * 1000);
            } catch (InterruptedException ex) {}
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
