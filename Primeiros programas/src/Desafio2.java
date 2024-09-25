import java.util.ArrayList;
import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner usuario = new Scanner(System.in);

        System.out.println("Me informe o primeiro número: ");
        int num1 = usuario.nextInt();
        numeros.add(num1);
        System.out.println("Me informe o segundo número: ");
        int num2 = usuario.nextInt();
        numeros.add(num2);
        System.out.println("Me informe o terceiro número: ");
        int num3 = usuario.nextInt();
        numeros.add(num3);

        System.out.println("Lista em ordem: " + numeros);

    }
}