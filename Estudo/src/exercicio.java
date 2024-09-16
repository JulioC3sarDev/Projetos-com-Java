import java.util.*;

public class exercicio {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número:");
        float num1 = usuario.nextFloat();
        System.out.println("Digite outro número:");
        float num2 = usuario.nextFloat();
        float calculo = (num1 + num2) / 2;
        System.out.printf("O resultado do seu cálculo é de : %.1f", calculo);
    }
}