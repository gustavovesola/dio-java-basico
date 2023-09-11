import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor, digite o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Porfavor, informe o numero da sua agencia");
            String agencia = scanner.next();

        System.out.println("Porfavor, insira seu nome");
            String nomecliente = scanner.next();

        System.out.println("Porfavor, insira seu sobrenome");
            String sobrenomecliente = scanner.next();

        System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();

        System.out.println("Olá "  + nomecliente + " " + sobrenomecliente);
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia é: " + agencia);
        System.out.println("Conta " + numero);
        System.out.println("E seu saldo de " + saldo + " já está disponível para saque");
        System.out.println("FIM");

    }

}
