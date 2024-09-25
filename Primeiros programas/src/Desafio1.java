import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("informe a primeira nota do aluno: ");
        double nota1 = usuario.nextDouble();
        double ponTotal = 14;
        double finalTotal = 5;
        double calculo1 = (ponTotal - nota1);

        System.out.println("Nota 1: " + nota1);

        if (nota1 > 0) {
            System.out.println("Faltam " + calculo1 + " para ser aprovado!");

        }

        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = usuario.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
        double calculo2 = (10.0 - media);

        if (nota2 > calculo1) {
            System.out.println("Você foi aprovado!!");
        } else {
            System.out.println("Faltam " + calculo2 + " para ser aprovado na final!");
            System.out.println("informe a nota do aluno na final: ");
        }

        double finalA = usuario.nextDouble();
        double calculo3 = (media + finalA) / 2;

        if (calculo3 >= finalTotal) {
            System.out.println("Aprovado na final");

        } else {
            System.out.println("Reprovado na final");
        }
    }

}