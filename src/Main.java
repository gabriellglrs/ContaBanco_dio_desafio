import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int numero;
          double saldo;
          String agencia, nomeCliente;

          System.out.println("Por favor, digite o número da Agencia: ");
          agencia = sc.nextLine();
          System.out.println("Por favor, digite o nome do cliente: ");
          nomeCliente = sc.nextLine();
          System.out.println("Por favor, digite o numero da conta: ");
          numero = sc.nextInt();
          System.out.println("Por favor, digite o saldo: ");
          saldo = sc.nextDouble();

          System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ", o numero da sua conta é: " + numero + " e seu saldo é de: " + saldo + " ja esta disponivel para saque.");


     }
}