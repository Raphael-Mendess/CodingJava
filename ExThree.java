/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
import java.util.Scanner;
public class ExThree{
    public static void main(String[] args) {

        System.out.println("Digite o valor A");
        Scanner scanner = new Scanner(System.in);        
        double a = scanner.nextDouble(); 

        System.out.println("Digite o valor B");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor C");
        double c = scanner.nextDouble();

        System.out.println("Digite um valor D");
        double d = scanner.nextDouble();

        double diferenca = a * b - c * d;

        System.out.println("A diferença dos valores que você digitou corresponde a " + diferenca);

    }
}
