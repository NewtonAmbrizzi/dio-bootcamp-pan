import java.util.Random;

/*
 * Faça uma programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */

public class Exercicio03 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(101);
        }

        for (int numero : numeros) {
            System.out.print(Integer.toString(numero).concat(", "));
        }

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(Integer.toString(numeros[i] + 1).concat(", "));
        }
        
    }
    
}
