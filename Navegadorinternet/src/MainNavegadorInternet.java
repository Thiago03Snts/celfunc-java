import java.util.Scanner;

public class MainNavegadorInternet {
    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternetImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma ação:");
        System.out.println("1. Exibir Página");
        System.out.println("2. Adicionar Nova Aba");
        System.out.println("3. Atualizar Página");
        
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                navegador.exibirPagina();
                break;
            case 2:
                navegador.adicionarNovaAba();
                break;
            case 3:
                navegador.atualizarPagina();
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
        
        scanner.close();
    }
}
