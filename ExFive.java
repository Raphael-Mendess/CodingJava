/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
import java.util.Locale;
import java.util.Scanner;
public class ExFive{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int cod1, cod2, quantidade1, quantidade2;  
        double preco1, preco2, valorTotal;
        cod1 = scanner.nextInt();
        quantidade1 = scanner.nextInt();
        preco1 = scanner.nextDouble();
        cod2 = scanner.nextInt();
        quantidade2 = scanner.nextInt(); 
        preco2 = scanner.nextDouble();
        valorTotal = preco1 * quantidade1 + preco2 * quantidade2;
        System.out.printf("O valor total de todos os itens 1 e 2 é %.2f%n", valorTotal);
        scanner.close();     
    }
}

