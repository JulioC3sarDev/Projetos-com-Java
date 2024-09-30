import java.util.*;

public class CondicaoRepeticao {
    public static void main(String[]args){
        Scanner usuario = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true){
            System.out.println("informe um número: ");
            int numero = usuario.nextInt();

            if (numero < 0){
                break;
            }
            if (numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("O maior valor da lista foi de: " + maior + "\n" +
                "O menor valor foi de: " + menor);
    }


}
