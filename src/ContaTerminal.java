import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, insira o número da Agência: ");
        String agencia = input.next();

        System.out.println("Insira o número da conta: ");
        int numero = input.nextInt();

        System.out.println("Insira seu nome completo: ");
        String nome = input.next();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        input.close();
    }
}
