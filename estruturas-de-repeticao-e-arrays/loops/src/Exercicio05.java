import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar a 
 * tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 X 10 = 50
 */

public class Exercicio05 {

    static int numero;

    public static void main(String[] args) {

        do {
            lerNumero();
            if (numero < 1 || numero > 10) {
                System.out.println("Valor digitado inválido - tente novamente");
                numero = 0;
            } else {
                System.out.println("Tabuada de ".concat(Integer.toString(numero).concat(":")));
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Integer.toString(numero).concat(" X ").concat(Integer.toString(i).concat(" = ").concat(Integer.toString(i * numero))));
                }
            }

        } while (numero <= 0);
        
    }

    private static void lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite de qual número deseja realizar a tabuada:");
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Valor digitado inválido - tente novamente");
            numero = 0;
        }
    }
    
}
