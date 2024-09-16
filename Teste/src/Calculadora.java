import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = calculo.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = calculo.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = calculo.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("Resultado: %.1f", resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("Resultado: %.1f ", resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.printf("Resultado: %.1f ", resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: ", resultado);
                } else {
                    System.out.print("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.print("Operador inválido!");
                break;
        }
    }
}
