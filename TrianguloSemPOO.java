import java.util.Locale;
import java.util.Scanner;

public class TrianguloSemPOO{
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner lerVariavel = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC; 

        System.out.println("Enter the measures of triangle");
        xA = lerVariavel.nextDouble();
        xB = lerVariavel.nextDouble(); 
        xC = lerVariavel.nextDouble();

        System.out.println("Enter the measures of triangle");
        yA = lerVariavel.nextDouble(); 
        yB = lerVariavel.nextDouble();
        yC = lerVariavel.nextDouble();

        
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xA ) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB ) * (p - yC));

        System.out.printf("Triangle X área: %.4f%n", areaX);
        System.out.printf("Triangle Y área: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area X");
        }
        else{
            System.out.println("Larger area Y");
        } 

        lerVariavel.close();
    }
}