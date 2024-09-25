import java.util.*;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Informe um némero:");
        int num = usuario.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
