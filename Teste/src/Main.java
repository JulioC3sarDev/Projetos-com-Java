import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner nadador = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade = nadador.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.print("A sua categoria é Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.print("A sua categoria é Infaltil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.print("A sua categoria é Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.print("A sua categoria é Juvenil B");
        } else {
            System.out.print("A sua categoria é Adulto");
        }
    }
}
