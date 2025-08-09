package contabancaria;

public class ContaUpdated {  

    public String name;
    public int numberAccount;
    public double deposit;

      
  public ContaUpdated(int numberAccount, String name, double Initialdeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.deposit = Initialdeposit; // ou usar método deposit()
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
    
