import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {

    public static final double PI = 3.14159; //Isso é uma constante e não variável, então adicionamos final e declaramos o nome da constante tudo em maiusculos, constantes não mudam valor 
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume %.2f%n",v);

        sc.close();
    }

    public static double circumference(double radius){
        return 2.0 * PI * radius; 
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3; 
    }
}


/*Perceba que incluimos static em todos os métodos como volume, circumference e PI 
Em uma mesma classe você não pode adicionar um método que não seja static dentro de uma classe com o método principal static */