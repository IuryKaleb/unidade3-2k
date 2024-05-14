package exemplos;

import java.util.Scanner;

public class TesteContaPoupanca {

        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca(456, "Iury");
        System.out.println("Digite o valor a ser depositado: ");
        cp.depositar(entrada.nextDouble());
        cp.reajustar(1);
        System.out.println("Seu saldo após o rendimento é: " + cp.getSaldo());
    }

}
