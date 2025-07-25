//Estrutura Do While
import java.util.Locale;
import java.util.Scanner;

public class FarenheitCelsiusTwo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);
        
        char resposta;
        
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Temperatura equivalente em Farenheit: %.2f%n", F);
            System.out.print("Deseja repetir (s/n) ? ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');
        
        scanner.close();
    }
}
