import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class MembrosEstaticos2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator(); // Objeto instanciado pois agora os métodos não são mais estáticos e estão em outra classe 'util'
 
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume %.2f%n",v);
        System.out.printf("PI value: %.2f%n",Calculator.PI);

        sc.close();
    }
}

