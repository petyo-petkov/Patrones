package demo;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numerosPares(numeros);
        numerosImpares(numeros);
    }
    public static void numerosPares(int[] numeros){

        for (int numero : numeros) {
            if (numero %2 == 0){
                System.out.println("El numero " + numero + " es par" );
            }
        }
    }
    public static void numerosImpares(int[] numeros) {
        for(int numero : numeros) {
            if(numero %2 != 0){
                System.out.println(numero + " Es numero impar");
            }
        }

    }

}