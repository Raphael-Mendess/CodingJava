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
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double AreaTrianguloX = Math.sqrt(p * (p - x.a) * (p - x.b ) * (p - x.c));

        p = (y.d+ y.e + y.f) / 2;
        double AreaTrianguloY = Math.sqrt(p * (p - y.d) * (p - y.e) * (p - y.f));

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
