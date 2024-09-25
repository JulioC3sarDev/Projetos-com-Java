import java.util.*;

public class Temperatura {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.print("Me informe sua temperatura:");
        float temp1 = usuario.nextFloat();
        float temp2 = (temp1 - 32) * 5 / 9;
        System.out.printf("A temperatura em celsius é de: %.2f°C", temp2);

    }

}
