package banco;

import contabancaria.ContaUpdated;
import java.util.Locale;
import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

          
        System.out.printf("Enter account number:");
        int numberAccount = sc.nextInt();
        sc.nextLine(); 

        System.out.println();
        System.out.printf("Enter account holder:");
        String name = sc.nextLine();

       
        System.out.println();
        System.out.printf("Is there an initial deposit (y/n)?");
        char caractere = sc.next().charAt(0); 
     
        double initialDeposit = 0;

        if (caractere == 'y') {
            System.out.print("Enter a initial deposit value: ");
            initialDeposit = sc.nextDouble(); 
        } else if (caractere == 'n') {
            System.out.println("Nenhum depósito realizado.");
        } else {
            System.out.println("Opção inválida.");        }

       
        ContaUpdated account = new ContaUpdated(numberAccount, name, initialDeposit);

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();
        System.out.printf("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.addMoney(deposit);
        System.out.println("Updated account data: ");  

               
        System.out.println();
        System.out.println(account);


        System.out.println();
        System.out.printf("Enter a withraw value: ");
        deposit = sc.nextDouble();
        account.withdrawMoney(deposit);


        System.out.println("Updated account data:");
        System.out.println(account);    


        sc.close();
    }
}
