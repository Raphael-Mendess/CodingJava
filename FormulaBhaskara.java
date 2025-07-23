import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara{
    public static void main(String[]args){
        
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in); 
        
        double a, b, c, delta;
        
        System.out.println("Digite os valores do coeficiente");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        
        delta = b * b - 4 * a * c; // Cálculo do valor de delta
        
        System.out.println("O valor de delta corresponde a" + delta);
    } 
}
