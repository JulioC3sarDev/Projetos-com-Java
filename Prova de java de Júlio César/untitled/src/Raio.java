import java.util.*;

public class Raio {
    public static void main(String[]args){
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = usuario.nextFloat();
        double area = (3.14 * raio) * raio;

        System.out.println("A área do círculo é de: " + area);
    }

}

