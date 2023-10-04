import java.util.Scanner;

public class MainReprodutorMusical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();

        System.out.println("Escolha uma ação para o Reprodutor Musical:");
        System.out.println("1. Tocar Música");
        System.out.println("2. Pausar Música");
        System.out.println("3. Selecionar Música");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                reprodutor.tocar();
                break;
            case 2:
                reprodutor.pausar();
                break;
            case 3:
                reprodutor.selecionarMusica();
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }

        scanner.close();
    }
}
