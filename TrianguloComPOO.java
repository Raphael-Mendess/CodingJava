import java.util.Locale;
import java.util.Scanner;

import modelo.Triangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite os lados do triângulo X:");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y:");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double p = (x.A + x.B + x.C) / 2;
        double AreaTrianguloX = Math.sqrt(p * (p - x.A) * (p - x.B ) * (p - x.C));

        p = (y.D + y.E + y.F) / 2;
        double AreaTrianguloY = Math.sqrt(p * (p - D) * (p - E ) * (p - F));

        System.out.printf("Área do triângulo X: %.4f\n", areaX);
        System.out.printf("Área do triângulo Y: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: Triângulo X");
        } else if (areaY > areaX) {
            System.out.println("Maior área: Triângulo Y");
        } else {
            System.out.println("As áreas são iguais");
        }

        sc.close();
    }
}
