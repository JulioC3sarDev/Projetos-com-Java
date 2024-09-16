import java.util.*;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Me informe o primeiro número:");
        double num1 = usuario.nextFloat();
        System.out.println("Digite outro número:");
        double num2 = usuario.nextFloat();
        System.out.println("Escolha o operador do cálculo (+ , - , * , / ):");
        char operador = usuario.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado da operação foi:" + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado da operação foi:" + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado da operação foi:" + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("O resultado da operação foi:" + resultado);
                break;

        }

    }
}