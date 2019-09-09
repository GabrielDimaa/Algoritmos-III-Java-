class MeusArrays {

    static int verifica(int[] array1, int[] array2, int numero) {

        int fim = 0;

        if (inArray(array1, numero) || inArray(array2, numero)) {
            fim = 1;
        }

        else if (inArray(array1, numero) && inArray(array2, numero)) {
            fim = 2;
        }

        return (fim);

    }


    static int[] novoArray(int numero){

        int[] array = new int[numero];

        for (int i=0; i<numero; i++) {
            array[i] = (int)(Math.random() * 1001);
        }

        return (array);

    }


    static boolean inArray(int[] array, int numero){

        for(int i=0; i<array.length; i++){
            if(array[i] == numero){
                return true;
            }
        }

        return false;

    }

}
