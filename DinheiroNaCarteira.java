import java.util.Scanner;

public class DinheiroNaCarteira{
    public static void main(String[]args){
        
    Scanner ler = new Scanner(System.in);
        
    System.out.println("Digite 1 para contar de 0 até 50.000 mil");
    System.out.println("Digite 2 para contar de 0 até 100.000 mil");
        
    int numero = ler.nextInt();
        
            if (numero == 1){
            for (int i = 0; i <=50000; i++){
               System.out.println(i);
            }
                
            }else if(numero ==2){
            for (int i = 0;i <= 100000;i++){
                System.out.println(i);
            } 
        }
        
        
        if(numero == 1){
        System.out.println("Parabéns, agora você tem 50.000 mil na conta");    
        }else if(numero ==2){
          System.out.println("Parabéns, agora você tem 100.000 mil na conta");  
        }
        
       ler.close();
    }
}
