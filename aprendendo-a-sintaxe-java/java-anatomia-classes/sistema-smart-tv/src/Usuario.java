import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();


        isOn(smartTv);

        ligarEDesligar(smartTv);

        isOn(smartTv);

        mostrarCanal(smartTv);

        smartTv.aumentarCanal();
        mostrarCanal(smartTv);
        
        smartTv.diminuirCanal();
        mostrarCanal(smartTv);

        mostrarVolume(smartTv);
        
        smartTv.aumentarVolume();
        mostrarVolume(smartTv);

        smartTv.diminuirVolume();
        mostrarVolume(smartTv);

        escolherCanal(smartTv);
        mostrarCanal(smartTv);

        ligarEDesligar(smartTv);
        isOn(smartTv);

    }

    public static void ligarEDesligar(SmartTv smartTv) {
        smartTv.botaoOnOff();
    }

    public static void isOn(SmartTv smartTv) {
        System.out.println("A TV está ".concat(smartTv.estadoTv()));
    }

    public static void mostrarCanal(SmartTv smartTv) {
        System.out.println("O canal atual é ".concat(Integer.toString(smartTv.getCanal())));
    }

    public static void mostrarVolume(SmartTv smartTv) {
        System.out.println("O volume atual é ".concat(Integer.toString(smartTv.getVolume())));
    }

    public static void escolherCanal (SmartTv smartTv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do canal");
        int canal = scanner.nextInt();
        smartTv.setCanal(canal);
    }

}
