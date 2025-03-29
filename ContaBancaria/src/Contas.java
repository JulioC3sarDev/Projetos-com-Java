import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria contas[] = new ContaBancaria[3];

        ContaBancaria conta1 = new ContaBancaria(250, "070", "28", 'N');
        contas[0] = conta1;
        conta1.registraDeposito(9000);

        ContaBancaria conta2 = new ContaBancaria(820, "150", "50", 'E');
        contas[1] = conta2;
        conta2.registraDeposito(4000);

        ContaBancaria conta3 = new ContaBancaria(120, "58", "98", 'E');
        contas[2] = conta3;
        conta3.registraDeposito(2000);

        double saldoTotal = 0;


        for (int i = 0; i < contas.length; i++) {
            System.out.println("-----------------------");
            System.out.println("identificador: " + contas[i].getIdConta());
            System.out.println("Agência: " + contas[i].getAgencia());
            System.out.println("Numero: " + contas[i].getNumeroConta());
            System.out.println("tipo: " + contas[i].getTipo());
            System.out.println("Saldo: " + contas[i].getSaldo());
            saldoTotal += contas[i].getSaldo();
            System.out.println("Saldo Total: " + saldoTotal);
        }

        System.out.println("Id para pesquisar:");
        int idPesquisar = sc.nextInt();

        int posicaoEncontrada = -1;

        for (int i = 0; i < contas.length; i++) {

            if (contas[i].getIdConta() == idPesquisar){
                posicaoEncontrada = i;
                System.out.println("Digite o valor a ser depositado: ");
                double valor = sc.nextDouble();
                contas[i].registraDeposito(valor);
                System.out.println("Id: " + contas[i].getIdConta());
                System.out.println("Saldo: " + contas[i].getSaldo());
                System.out.println("Deposito efetuado");
                break;
            }
        }
        if (posicaoEncontrada == -1){
            System.out.println("Conta inexistente");
        }

        System.out.println("Id para pesquisar:");
        int id = sc.nextInt();

        int posicao = -1;

        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getIdConta() == id){
                posicao = i;
                System.out.println("Qual valor deseja sacar? : ");
                double valor = sc.nextDouble();
                contas[i].registraSaque(valor);
                System.out.println("Id: " + contas[i].getIdConta());
                System.out.println(contas[i].getSaldo());
                System.out.println("Saque efetuado");
                System.out.println("Saque foi efetuado? " + contas[i].registraSaque(valor));
                break;
            }
        }
        if (posicaoEncontrada == -1){
            System.out.println("Conta inexistente");
        }
    }
}
