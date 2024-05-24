import java.util.Scanner;
public class ContaTerminal {
    
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, informe o número da agência: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, informe a sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor indique o seu saldo bancário: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá" + nome + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" ,conta "+ numero +" e o seu saldo é de: " + saldo +" já está disponível para saque.");
        }
}
