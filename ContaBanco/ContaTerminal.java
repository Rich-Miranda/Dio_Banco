package ContaBanco;

import java.util.*;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !" );
        int agencia = sc.nextInt();

        System.out.println("Por favor, digite o numero !");
        int num = sc.nextInt();

        System.out.println("Por favor, digite seu nome !");
        String nome = sc.next();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + num + " e seu saldo " + saldo +" já está disponível para saque");
    }
}
