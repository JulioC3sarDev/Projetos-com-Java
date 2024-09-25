import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me diga sua idade:");
        int idade = scanner.nextInt();
        int DiasVividos = idade * 365;
        System.out.println("Você viveu " + DiasVividos + " dias.");
    }
}