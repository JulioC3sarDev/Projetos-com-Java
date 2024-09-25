import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        double saldo = 2500;
        System.out.println("Dados iniciais do clinete:\n\n\nNome: Júlio César\nTipo de conta: Corrente\nSaldo: R$ " + saldo + "\n");
        Scanner usuario = new Scanner(System.in);

       int contador = 0;

        while (contador < 5) {

            System.out.println("\nOperações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a opção desejada: ");
            int operacao = usuario.nextInt();

            if (operacao == 1){
                System.out.println("Seu saldo é de : " + saldo);

            }else if (operacao == 2){
                System.out.println("Informe o valor a ser recebido: R$ ");
                double valor = usuario.nextDouble();
                double recebido = saldo + valor;
                saldo += recebido;

            }else if (operacao == 3){
                System.out.println("Informe o valor a ser transferido: R$ ");
                double valor = usuario.nextDouble();
                if (valor > saldo){
                    System.out.println("\nO valor é maior que o disponivel em conta!");
                }else{
                    double transferido = saldo - valor;
                    saldo -= transferido;
                }
            }else {
                System.out.println("Operação encerrada!");
                break;
            }


        }



    }
}
