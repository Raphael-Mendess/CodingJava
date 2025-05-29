import java.util.Scanner;
public class MaiorMenor{
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor 1:");
            double n1 = scanner.nextDouble();
            
            System.out.println("Digite o valor 2:");
            double n2 = scanner.nextDouble();
            
            System.out.println("Digite o valor 3:");
            double n3 = scanner.nextDouble();
               
            //Verificando qual é o menor
            double menor = n1;
            if (n1 > n2 && n3 > n2){
                menor = n2;
            }else if (n2 > n3 && n1 > n3){
                menor = n3;
            }  
            //verificando qual é o maior
            double maior = n1;
            if (n2 > n1 && n2 > n3){
                maior = n2;
            }else if(n3 > n1 && n3 > n2){
                maior = n3;
            }
            //Escrevendo na tela os resultados
            System.out.println("O maior valor digitado foi " + maior);
            System.out.println("O menor valor digitado foi " + menor);
            scanner.close();
            }
     }                         
     

     
    
      
  