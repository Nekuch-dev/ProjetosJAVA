import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
         System.out.print("Digite o nome do cliente: ");
         String nomeCliente = scanner.nextLine();

         System.out.println("\nMenu de Lanches:");
         System.out.println("1 - Hambúrguer");
         System.out.println("2 - Cachorro-quente");
         System.out.println("3 - Sanduíche Natural");
         System.out.print("Escolha uma opção (1 a 3): ");
           int opcao = scanner.nextInt();
            scanner.nextLine();

        String pedido = "";

        switch (opcao) {
            case 1:
                pedido = "Hambúrguer";
                break;
            case 2:
                pedido = "Cachorro-quente";
                break;
            case 3:
                pedido = "Sanduíche Natural";
                break;
            default:
                pedido = "Opção inválida";
                break;
            }

        System.out.println("\nPedido registrado:");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Pedido: " + pedido);

        System.out.print("\nAvalie o atendimento de 1 a 5: ");
            int nota = scanner.nextInt();
            scanner.nextLine(); 

        if (nota == 5) {
            System.out.println("Muito obrigado pela ótima avaliação!");
        } else if (nota >= 3) {
            System.out.println("Obrigado! Vamos continuar melhorando.");
        } else if (nota >= 1) {
            System.out.println("Sentimos muito! Vamos melhorar nosso atendimento.");
        } else {
            System.out.println("Nota inválida.");
        }

        System.out.print("\nDeseja atender outro cliente?: ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Encerrando o sistema. Até logo!");
        scanner.close();
    }
}
