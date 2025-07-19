import java.util.Scanner;

public class ExEleven {

    public static void main(String[] args){  
        
        Scanner lerVariavel = new Scanner(System.in);
        
        int soma = 0;
        
        int numero = lerVariavel.nextInt();
        
        for (int i = 0; i < numero; i++) {               //Inicialização, condição, incremento(atualização)
            int x = lerVariavel.nextInt();
            soma = soma + x;
        }
        
        System.out.printf("O valor total dos números que você digitou corresponde a %d%n", soma);

        lerVariavel.close();
      }
}
