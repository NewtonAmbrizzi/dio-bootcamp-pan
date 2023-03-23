import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número e a média desses números
 */

public class Exercicio03 {
    
    static int numero = 0;
    static int maiorNumero = Integer.MIN_VALUE;
    static int media = 0;

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            lerNumero();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            media += numero;
        }

        System.out.println("Maior: ".concat(Integer.toString(maiorNumero)));
        System.out.println("Média: ".concat(Double.toString((double) media / 5)));

    }

    private static void lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Valor digitado inválido - 0 adicionado");
            numero = 0;
        }
    }
    
}
