import java.util.Locale;
import java.util.Scanner;
public class TriangulosSemPOO{
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        double  a,b,c,d,e,f;   

        System.out.println("Enter the measures of triangle X");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        double p = (a + b + c) / 2;
        double AreaTrianguloX = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        p = (D + E + F) / 2;
        double AreaTrianguloY = Math.sqrt(p * (p - d) * (p - e) * (p - f));

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
