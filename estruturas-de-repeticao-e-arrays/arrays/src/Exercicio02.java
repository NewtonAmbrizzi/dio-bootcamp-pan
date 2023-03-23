import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalConsoantes = 0;
        String[] letras = new String[6];
        int contador = 0;

        do {
            System.out.println("Digite uma letra:");
            String letra;
            letra = scanner.next();
            if (!verificaVogal(letra)) {
                totalConsoantes++;
            }
            letras[contador] = letra;
            contador++;
        } while (contador < letras.length);

        System.out.println("Total de Consoantes: ".concat(Integer.toString(totalConsoantes)));
        for (String letra : letras) {
            if (!verificaVogal(letra)) {
                System.out.print(letra.concat(" | "));
            }
        }

    }

    private static boolean verificaVogal(String letra) {
        boolean verificaVogal = letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u");
        if (!verificaVogal) {
            return false;
        }
        return true;
    }

}
