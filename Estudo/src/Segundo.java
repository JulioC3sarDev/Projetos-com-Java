import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.print("Me diga seu nome:");
        String nome = usuario.nextLine();
        System.out.print("Me diga seu nota:");
        float nota = usuario.nextFloat();
        System.out.printf("A nota de %s é: %.1f \n ", nome, nota);

    }
}