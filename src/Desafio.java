import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Jahseh Onfroy";
        String tipoConta = "Corrente";
        double saldo = 2177.77;
        int opcoes = 0;

        System.out.println("********************************************");
        System.out.println("\nDados iniciais do cliente:\n");
        System.out.println("Nome:           " + nome);
        System.out.println("Tipo conta:     " + tipoConta);
        System.out.println("Saldo inicial:  " + saldo);
        System.out.println("\n********************************************");

        String menu = """
                
                **Operações**
                
                1- Consultar saldo
                2- Depositar
                3- Transferir
                4- Sair
                """;

        while (opcoes != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada");
            opcoes = leitura.nextInt();

            if (opcoes == 1) {
                System.out.println("O saldo atual é de R$ " + saldo);
            } else if (opcoes == 2) {
                System.out.println("Informe o valor que deseja depositar");
                saldo += leitura.nextDouble();
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcoes == 3) {
                System.out.println("Digite o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (opcoes != 4) {
                System.out.println("""
                        
                        ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
                        ⚠⚠ OPÇÃO INVÁLIDA ⚠⚠
                        ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠""");
            }
        }
    }
}

