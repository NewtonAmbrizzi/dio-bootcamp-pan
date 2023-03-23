import java.util.Scanner;

/*
 * Faça um programa que peça uma nota entre 0 e 10.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até o usuário informar um valor válido
 */

 public class exercicio02 {

    static int nota = 11;
    
    public static void main(String[] args) {

        do {
            lerNota();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota: ".concat(Integer.toString(nota)));
        System.out.println("Programa finalizado...");
        
    }

    private static void lerNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota:");
        try {
            nota = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Valor digitado inválido");
            nota = 11;
        }
    }


}
