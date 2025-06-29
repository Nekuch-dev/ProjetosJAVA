import java.util.Scanner;
    public class Agendamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha o tipo da lavagem: ");
        System.out.println("1 - Lavagem rápida - R$35");
        System.out.println("2 - Lavagem simples - R$40");
        System.out.println("3 - Lavagem normal - R$60");
            String Lavagem = scanner.nextLine().toUpperCase();
            
            switch (Lavagem) {
                case "1":
                System.out.println("Lavagem rápida confirmada, Total = R$35, " + nome);                
                    break;
                case "2":
                System.out.println("Lavagem simples confirmada, Total = R$40, " + nome);
                    break;
                case "3":
                System.out.println("Lavagem normal cofirmada, Total = R$60, " + nome);
                    break;
                default:
                    System.out.println("Não trabalhamos com esse tipo de lavagem");
            }

        System.out.print("\nAvalie nosso serviço de 1 a 5: ");
            int nota = scanner.nextInt();
            scanner.nextLine();

            if (nota == 5) {
                System.out.println("Muito obrigado e volte sempre!");
            } else if (nota >= 3) {
                System.out.println("Esteremos melhorando cada vez mais. Por favor volte sempre!");
            } else if (nota >= 1) {
                System.out.println("Sentimos muito! estaremos sempre tentando melhorar. Por favor volte sempre!");
            } else {
                System.out.println("nota inválida");
            }

            System.out.print("Carregando dados");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");
            }
        System.out.println("\n"); 

            System.out.print("Deseja agendar mais alguma lavagem?: ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Encerrando sistema...");
        scanner.close();            
        }
    }