import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agency = "";
        int accountNumber = 0;
        String customerName = "";
        double balance = 0.0;

        try {
            System.out.print("Por favor, digite o número da Agência: ");
            agency = scanner.nextLine();

            System.out.print("Por favor, digite o número da Conta: ");
            accountNumber = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Por favor, digite o nome do Cliente: ");
            customerName = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da Conta: ");
            balance = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de que os tipos de dados estejam corretos.");
            System.exit(1); // Encerrar o programa devido ao erro
        }

        scanner.close();

        String message = "Olá " + customerName + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                         agency + ", conta " + accountNumber + ", e seu saldo " + balance + " já está disponível para saque.";

        System.out.println(message);
    }
}

