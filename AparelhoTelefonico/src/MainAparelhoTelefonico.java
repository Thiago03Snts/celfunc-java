import java.util.Scanner;

public class MainAparelhoTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();

        System.out.println("Escolha uma ação para o Aparelho Telefônico:");
        System.out.println("1. Ligar");
        System.out.println("2. Atender Chamada");
        System.out.println("3. Iniciar Correio de Voz");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                telefone.ligar();
                break;
            case 2:
                telefone.atender();
                break;
            case 3:
                telefone.iniciarCorreioVoz();
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }

        scanner.close();
    }
}
