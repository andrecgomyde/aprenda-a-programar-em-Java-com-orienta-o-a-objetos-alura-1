import java.sql.SQLOutput;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner valorNota = new Scanner(System.in);

        double nota = 0;
        double notaFinal = 0;

        for (int i = 0; i < 3; i++) {
           System.out.println("Digite a sua nota:");
           nota = valorNota.nextDouble();
           notaFinal += nota;
        }

        System.out.println("A sua média final é: " + notaFinal/3);
    }
}
