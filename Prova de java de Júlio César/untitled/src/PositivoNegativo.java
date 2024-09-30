import java.util.*;

public class PositivoNegativo {
    public static void main(String[]args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o valor a ser verificado: ");
        double numero = usuario.nextFloat();

        if (numero < 0){
            System.out.println("O número é negativo!!");

        }else{
            System.out.println("o número é positivo!!");
        }
    }
}