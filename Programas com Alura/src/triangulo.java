import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
       ///entrada
        System.out.println("Digite o valor de X: ");
        int x = usuario.nextInt();
        System.out.println("Digite o valor de Y");
        int y = usuario.nextInt();
        System.out.println("Digite o valor de Z: ");
        int z = usuario.nextInt();
        ///condição
        if(x + y > z && x + y > z && y + z > x){

            if(x == y && x == z){
                System.out.println("É um Equilatero!! burro");
            }else if (x == y || y == z || x == z){
                System.out.println("É um isosceles!! burro");
            }else{
                System.out.println("É um escaleno!! burro");
            }

        }else{
            System.out.println("É um sapato!! burro");
        }
    }
}