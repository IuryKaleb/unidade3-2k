package exemplos;

import java.util.Scanner;

public class Teste2 {

        public static void main(String[] args) {
            Conta c = new Conta();
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor que deseja depositar: ");
            c.depositar(entrada.nextDouble());
            System.out.println("Seu saldo é de: " + c.saldo);
            System.out.println("Digite o valor a ser sacado: ");
            boolean saqueEfetuado = c.sacar(entrada.nextDouble());
            if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("Saldo indisponível!!");;
        }
            System.out.println(saqueEfetuado);
            System.out.println("Saldo: " + c.saldo);
    }
}
            
            
            
            
            
    


