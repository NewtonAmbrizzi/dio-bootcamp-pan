import java.util.Random;

/*
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. 
 */

public class Exercicio01 {

    static int[] numeros = new int[6];

    public static void main(String[] args) {

        
        povoarArray();

        System.out.println("Ordem original: ");

        for (int numero : numeros) {
            System.out.print(Integer.toString(numero).concat(" | "));
        }

        System.out.println("\nOrdem inversa: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(Integer.toString(numeros[i]).concat(" | "));
        }
        
    }

    private static void povoarArray() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            Random aleatorio = new Random();
            numeros[i] = aleatorio.nextInt(21);
        }
    }

       
}
