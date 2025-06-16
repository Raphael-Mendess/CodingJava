import java.util.Locale;
import java.util.Scanner;
public class TriangulosSemPOO{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        double  A, B, C, D, E, F;   

        System.out.println("Enter the measures of triangle X");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        D = scanner.nextDouble();
        E = scanner.nextDouble();
        F = scanner.nextDouble();

        double p = (A + B + C) / 2;
        double AreaTrianguloX = Math.sqrt(p * (p - A) * (p - B ) * (p - C));

        p = (D + E + F) / 2;
        double AreaTrianguloY = Math.sqrt(p * (p - D) * (p - E ) * (p - F));

        System.out.printf("Triangle X área: %.4f%n", AreaTrianguloX);
        System.out.printf("Triangle Y área: %.4f%n", AreaTrianguloY);

        if (AreaTrianguloX > AreaTrianguloY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
        
    scanner.close();
    }
}