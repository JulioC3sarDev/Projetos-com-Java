import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = usuario.nextDouble();
        double media = 14.0;
        double calulo1 = (media - nota1);

        System.out.println("A sua primeira nota é de: " + nota1);
        System.out.println("É necessário " + calulo1 + " para ser aprovado direto!");

        double mediaFinal = 5.0;

        System.out.println("informe a segunda nota: ");
        double nota2 = usuario.nextDouble();
        double media2 = (nota1 + nota2) / 2;
        double calculo2 = (10 - media2);
        System.out.println("A sua segunda nota é de: " + nota2);
        System.out.println("Sua média é de: " + media2);

        if (media2 >= 7) {
            System.out.println("você passou direto!!!");
        } else {
            System.out.println("É necessário " + calculo2 + " para ser aprovado na final");
            System.out.println("informe a sua nota na final: ");
            double notaFinal = usuario.nextDouble();
            System.out.println("Sua nota na final é : " + notaFinal);

            if (notaFinal >= mediaFinal) {
                System.out.println("Você foi aprovado na final!!!!");
            } else {
                System.out.println("Você foi repovado, até ano que vem!!");
            }
        }


    }
}