import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        System.out.println("O numero da Conta é " + numero );
        System.out.println("Sua agencia é " + agencia );
        System.out.println("Nome do Cliente " + nome + " " + sobrenome);
        System.out.println("Seu saldo é " + saldo );
    }
}
