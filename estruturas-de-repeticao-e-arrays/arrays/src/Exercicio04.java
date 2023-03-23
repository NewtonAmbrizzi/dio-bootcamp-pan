import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */

public class Exercicio04 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int[][] matrizM = new int[4][4];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(10);
            }
            
        }

        for (int i = 0; i < matrizM.length; i++) {
            System.out.print("Linha " + (i+1) + " | ");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " | ");
            }
            System.out.println();
        }

    }
    
}
