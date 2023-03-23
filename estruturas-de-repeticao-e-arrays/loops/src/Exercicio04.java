import java.util.Scanner;

/*
 * Faça um programa que pça N números inteiros, calcule e mostre 
 * a quantidade de números pares e a quantidade de números ímpares.
 */

public class Exercicio04 {

    static int numero = 0;

    public static void main(String[] args) {

        System.out.println("Quantos números deseja analisar?");
        lerNumero();
        int contador = numero;
        int par = 0, impar = 0, neutro = 0;

        if (contador > 0) {
            while (contador > 0) {
                lerNumero();
                if (numero == 0) {
                    neutro++;
                } else if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                contador--;
            }
            System.out.println("Neutros: ".concat(Integer.toString(neutro)));
            System.out.println("Pares: ".concat(Integer.toString(par)));
            System.out.println("Ímpares: ".concat(Integer.toString(impar)));

        } else {
            System.out.println("Programa encerrado");            
        }


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
