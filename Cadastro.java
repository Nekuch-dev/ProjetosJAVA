import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
        System.out.print("Digite o nome do visitante: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite o motivo da visita");
        System.out.println("1 - Estudo");
        System.out.println("2 - Reunião");
        System.out.println("3 - Entrevista");
            String motivo = scanner.nextLine();

        switch (motivo) {
            case "1":
                System.out.println("Bem-vindo ao centro de estudos, " + nome);
                break;
            case "2":
                System.out.println("Sala de reuniões à direita, " + nome);
                break;
            case "3":
                System.out.println("Boa sorte na entrevista, " + nome);
                break;
            default:
                System.out.println("Motivo não reconhecido.");
            }

        System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

        if (idade < 18) {
            System.out.println("Atenção: menores de 18 devem estar acompanhados.");
        } else {
            System.out.println("Acesso liberado.");
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

            System.out.print("Deseja atender outro visitante?: ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Encerrando sistema...");
        scanner.close();
    }
}