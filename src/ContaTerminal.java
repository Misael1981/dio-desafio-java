import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nome, sobrenome, agencia, numero, saldo);
    }
}
