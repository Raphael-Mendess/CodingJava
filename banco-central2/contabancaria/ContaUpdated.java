package contabancaria;

public class ContaUpdated {  

    private String name;
    private int numberAccount;
    private double deposit;

      
    public ContaUpdated(int numberAccount, String name, double Initialdeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.deposit = Initialdeposit; // ou usar método deposit()
    }
   
     
    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
       return name;
    }
    
    public void setName(String name) {
       this.name = name;
    }
    
    public double getDeposit() {
       return deposit;
    }


    public void addMoney(double amount) {
        this.deposit = deposit + amount;        
    }


    public void withdrawMoney(double amount) {
    if(amount <= this.deposit) {
        this.deposit = deposit - amount;
    } else {
        System.out.println("Saldo insuficiente!");
       }
    }


    public String toString() {
        return "Conta:"
        + numberAccount  + ", "
        + "Nome da Conta:" 
        + name + ", "
        + String.format("Saldo disponível:$%.2f", deposit);              
    }
}
