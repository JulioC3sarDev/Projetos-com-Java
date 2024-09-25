import java.util.*;

public class Exemplo01 {
    public static void main(String[] Args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = usuario.nextInt();
        for (int i = num; i != 0; i--) {
            System.out.println(i);
        }
    }
}
