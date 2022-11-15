import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double delta = b*b - 4.0 * a * c;

        if (a == 0 || delta < 0.0 ) {
            System.out.println( "Impossivel calcular");
        }
        else {
            Double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            Double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);

        }
        sc.close();
    }
}