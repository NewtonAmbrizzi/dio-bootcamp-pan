import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome e o segundo representando a idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class exercicio01 {

    static Scanner scanner = new Scanner(System.in);
    static String nome = "0";
    static int idade = 0;

    public static void main(String[] args) {

       while (true) {
        lerNome();
        if (nome.equals("0")) {
            break;
        }
        lerIdade();
       }

       System.out.println("Programa finalizado");
        
    }

    private static void lerNome() {
        System.out.println("Digite um nome:");
        nome = scanner.next();
    }

    private static void lerIdade() {
        System.out.println("Digite uma idade");
        idade = scanner.nextInt();
    }

}