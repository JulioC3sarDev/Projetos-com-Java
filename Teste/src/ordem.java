import java.util.*;

public class ordem {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        float num1 = numeros.nextFloat();
        System.out.print("Digite o proxímo número:");
        float num2 = numeros.nextFloat();
        System.out.print("Digite o último número");
        float num3 = numeros.nextFloat();
        if (num1 <= num2 && num2 <= num3) {
            System.out.print("A ordem será:" + num1 + "," + num2 + "," + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println("A ordem será:" + num1 + "," + num3 + "," + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println("A ordem será:" + num2 + "," + num1 + "," + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println("A ordem será:" + num2 + "," + num3 + "," + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println("A ordem será:" + num3 + "," + num1 + "," + num2);
        } else {
            System.out.println("A ordem será:" + num3 + "," + num2 + "," + num1);
        }

    }

}
