import entidade.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class TrianguloComPOO2 {
  public static void main(String[] args) {
      
  Locale.setDefault(Locale.US);
    
  Scanner LerVariavel = new Scanner (System.in);
  
  Triangle x, y;
  x = new Triangle ();
  y = new Triangle (); 

  System.out.println("Enter the measures of Triangle X:");
  x.a = LerVariavel.nextDouble();
  x.b = LerVariavel.nextDouble();
  x.c = LerVariavel.nextDouble();

  System.out.println("Enter the measures of Triangle Y:"); 
  y.a = LerVariavel.nextDouble();
  y.b = LerVariavel.nextDouble();
  y.c = LerVariavel.nextDouble();

  double calculoDeX = x.calcularArea();
  double calculoDeY = y.calcularArea();

  System.out.printf("Triangle X area: %.4f%n", calculoDeX);
  System.out.printf("Triangle Y area: %.4f%n", calculoDeY);


  if (calculoDeX > calculoDeY){
    System.out.println("Larger Area: X");
  }
  else{
    System.out.println("Larger Area: Y");
  }

LerVariavel.close();  
  }  
}
