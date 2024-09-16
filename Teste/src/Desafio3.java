import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio3 {
    public static void main(String[] args) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String data1Str = "12/06/2012";
        String data2Str = "30/11/2012";
        String data3Str = "02/09/2012";

        LocalDate data1 = LocalDate.parse(data1Str, formato);
        LocalDate data2 = LocalDate.parse(data2Str, formato);
        LocalDate data3 = LocalDate.parse(data3Str, formato);

        if ((data3.isAfter(data1) || data3.isEqual(data1)) && (data3.isBefore(data2) || data3.isEqual(data2))) {
            System.out.println("A data3 está entre data1 e data2!");
        } else {
            System.out.println("A data3 não está entre data1 e data2!");
        }
    }
}
