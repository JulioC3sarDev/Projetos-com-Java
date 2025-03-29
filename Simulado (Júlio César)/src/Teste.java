import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo vei1 = new Veiculo("LXP8L454","Bugatti Veyron");

        Orcamento[] orcamentos = new Orcamento[2];

        Orcamento n1 = new Orcamento(25,"gabriel","98119161");
        orcamentos[0] = n1;

        Orcamento n2 = new Orcamento(28,"Dudinha","98411161");
        orcamentos[1] = n2;

        System.out.println("Veículo: " + vei1.getModelo() + "\nPlaca: " + vei1.getPlaca());
        System.out.println("------------------------------------");
        System.out.println("Nr: " + n1.getNrOrcamento());
        System.out.println("Data: " + n1.getDataFormatada());
        System.out.println("Nome: " + n1.getNomeContato());
        System.out.println("Telefone: " + n1.getTelefoneContato());
        System.out.println("------------------------------------");

        System.out.println("Qual valor do orcamento:");
        double valor = sc.nextDouble();
        System.out.println("------------------------------------");

        if (n1.registrarValor(valor) == true) {
            System.out.println("valor registrado");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());
        }
        else{
            System.out.println("Valor não registrado");
        }

        System.out.println("------------------------------------");
        System.out.println("O orçamento foi aprovado? ");
        char decisao = sc.next().charAt(0);
        System.out.println("------------------------------------");

        if(decisao == 'A' || decisao == 'a') {
            n1.definirExecucao(decisao);
            System.out.println("Orçamento aprovado");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());
        }
        else if(decisao == 'R' || decisao == 'r') {
            n1.definirExecucao(decisao);
            System.out.println("Orçamento Reprovado");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());

        }

        System.out.println("------------------------------------");

        if(n1.getSituacao() == '4') {
            n1.avancar();
            System.out.println("O orçamento foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());
            System.out.println("Orçamento Arquivado");
        }

        else if(n1.getSituacao() == '3') {
            n1.avancar();
            System.out.println("O orçamento foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());
            System.out.println("Serviço Realizado");

        }

        else{
            n1.avancar();
            System.out.println("O orçamento não foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n1.getValor() + "\nSituação: " + n1.getSituacao());

        }

        System.out.println("------------------------------------");

        System.out.println("Qual valor do segundo orcamento: ");
        double valor2 = sc.nextDouble();

        System.out.println("------------------------------------");

        if (n2.registrarValor(valor2) == true) {
            System.out.println("valor registrado");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n2.getValor() + "\nSituação: " + n2.getSituacao());
        }
        else{
            System.out.println("Valor não registrado");
        }

        System.out.println("------------------------------------");

        if(n2.getSituacao() == '4') {
            n2.avancar();
            System.out.println("O orçamento foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nalor do orçamento: R$" + n2.getValor() + "\nSituação: " + n2.getSituacao());
            System.out.println("Orçamento Arquivado");
        }

        else if(n2.getSituacao() == '3') {
                n2.avancar();
            System.out.println("O orçamento foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n2.getValor() + "\nSituação: " + n2.getSituacao());
            System.out.println("Serviço Realizado");

        }

        else{
            n2.avancar();
            System.out.println("O orçamento não foi para o próximo estágio");
            System.out.println("Placa do Véiculo: " + vei1.getPlaca() +
                    "\nValor do orçamento: R$" + n2.getValor() + "\nSituação: " + n2.getSituacao());

        }
    }
}