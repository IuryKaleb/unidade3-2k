package exemplos;

import java.util.Scanner;

public class Teste2 {

        public static void main(String[] args) {
            Conta c = new Conta();
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome do titular da conta: ");
            c.setNomeTitular(entrada.next());
            System.out.println("Digite o número da conta: ");
            c.setNumero(entrada.nextInt());
            System.out.println("Digite o valor que deseja depositar: ");
            c.depositar(entrada.nextDouble());
            System.out.println("Seu saldo é de: " + c.getSaldo());
            System.out.println("Digite o valor a ser sacado: ");
            boolean saqueEfetuado = c.sacar(entrada.nextDouble());
            if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("Saldo indisponível!!");;
        }
            System.out.println(saqueEfetuado);
            System.out.println("Saldo: " + c.getSaldo());
            System.out.println("Nome do Titular: " + c.getNometitular());
            System.out.println("Número da conta: " + c.getNumero());
            System.out.println(c);
    }
}
            
            
            
            
            
    


