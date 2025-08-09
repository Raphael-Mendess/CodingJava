package banco;

import contabancaria.ContaUpdated;
import java.util.Locale;
import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

          
        System.out.printf("Digite o número da sua conta do Bradesco: ");
        int numberAccount = sc.nextInt();
        sc.nextLine(); 

        System.out.println();
        System.out.printf("Entre com o nome da sua conta do Bradesco: ");
        String name = sc.nextLine();

       
        System.out.println();
        System.out.print("Este é o seu primeiro depósito no Banco ? (s/n) ");
        char caractere = sc.next().charAt(0); 
     
        double initialDeposit = 0;

        if (caractere == 's') {
            System.out.print("Entre com o primeiro depósito de dinheiro na sua conta: ");
            initialDeposit = sc.nextDouble(); 
        } else if (caractere == 'n') {
            System.out.println("Nenhum depósito realizado.");
        } else {
            System.out.println("Opção inválida.");        }

       
        ContaUpdated account = new ContaUpdated(numberAccount, name, initialDeposit);

        System.out.println();
        System.out.println("Atualização da sua conta do Banco do Bradesco:");
        System.out.println(account);

        System.out.println();
        System.out.println("Entre com outro depósito na sua conta:");
        double deposit = sc.nextDouble();
        account.addMoney(deposit);

        double adiction = initialDeposit + deposit;

         System.out.println("Contando o seu saldo...");
            for (int i = 1; i <= (int) adiction; i++) { 
                System.out.println("Saldo disponível: " + i);
            try {
                 Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
            
        System.out.println();    
        System.out.println("Contagem de dinheiro finalizada!");
             
        System.out.println();
        System.out.println("Atualização da sua conta do Banco Bradesco:");               
        System.out.println(account);

        System.out.println();
        System.out.println("Escolha um valor para saque:");
        deposit = sc.nextDouble();
        account.withdrawMoney(deposit);

        System.out.println();    
        System.out.println("Atualização da sua conta do Banco Bradesco:");
        System.out.println(account);    


        sc.close();
    }
}
