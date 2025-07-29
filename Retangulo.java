package retangulo;
import java.util.Scanner;
import rectangle.Rectangle;

public class Retangulo{
    public static void main(String[] args) {

        Scanner lerVar =  new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = lerVar.nextDouble();
        double height = lerVar.nextDouble();
        
        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rect.width = lerVar.nextDouble();
        rect.height = lerVar.nextDouble();
        
        System.out.println("Area = " + rect.areaDoRetangulo());
        System.out.println("Perimeter = " + rect.areaDoPerimetro());
        System.out.println("Diagonal = " + rect.areaDiagonal());

        lerVar.close();   
    }
}
