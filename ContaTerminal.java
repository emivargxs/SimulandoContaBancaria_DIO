
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nome = entrada.nextLine();
        
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = entrada.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo R$: " + saldo + " já está disponível para saque.");

        entrada.close();
    }
}
