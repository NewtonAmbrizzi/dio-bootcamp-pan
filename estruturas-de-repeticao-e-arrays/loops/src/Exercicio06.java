import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */

public class Exercicio06 {

    static int numero = 0;

    public static void main(String[] args) {

        int fatorial = 1;

        do {
            lerNumero();
            if (numero < 1) {
                System.out.println("Valor digitado inválido - tente novamente");
                numero = 0;
            } else {
                for (int i = numero; i >= 2; i--) {
                    fatorial *= i;
                }
                System.out.println(Integer.toString(numero).concat("!=").concat(Integer.toString(fatorial)));
            }

        } while (numero <= 0);

    }

    private static void lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite de qual número deseja fatorar:");
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Valor digitado inválido - tente novamente");
            numero = 0;
        }
    }

}
