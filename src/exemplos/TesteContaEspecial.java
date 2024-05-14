package exemplos;

import java.util.stream.DoubleStream;

public class TesteContaEspecial {

        public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(123, "Kaleb", 600);
        ce.depositar(550);
        ce.setNumero(364185);
        ce.setNomeTitular("Iury Kaleb");
        ce.setLimite(300);
        System.out.println(ce.getSaldo());
        System.out.println(ce);
    }

}
