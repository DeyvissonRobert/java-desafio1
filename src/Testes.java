import java.util.Scanner;

public class DesafioSolo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                ********************************************
                Dados iniciais do cliente:
                
                Nome:           Kaylanny Silva Costa
                Tipo conta:     Corrente
                Saldo inicial:  R$ 2500,00
                ********************************************
                """);
        //        System.out.println("""
//                ********************************************
//                Dados iniciais do cliente:
//                """);
//        System.out.println("Nome:           Kaylanny Silva Costa");
//        System.out.println("Tipo conta:     Corrente");
//        System.out.println("Saldo inicial:  " + saldo);
//        System.out.println("********************************************");
        double saldo = 2500.00;
        int opcoes = 0;

        while (opcoes != 4) {
            System.out.println("""
                    
                    Operações
                    
                    1- Consultar saldo
                    2- Depositar
                    3- Transferir
                    4- Sair
                    """);
            System.out.println("Digite a opção desejada");
            opcoes = leitura.nextInt();

            if (opcoes == 1) {
                System.out.println("O saldo atual é de R$ " + saldo);
            };

            if (opcoes == 2) {
                System.out.println("Informe o valor que deseja depositar");
                saldo += leitura.nextInt();
                System.out.println("Saldo atualizado R$ " + saldo);
            };

            if (opcoes == 3) {
                System.out.println("Digite o valor que deseja transferir");

                if (saldo > leitura.nextInt()) {
                    saldo -= leitura.nextInt();
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }

        }
    }
}
