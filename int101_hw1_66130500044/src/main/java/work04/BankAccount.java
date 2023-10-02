/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author Codone
 */
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;
    public BankAccount(int number,Person owner, double balance){
        this.number=number;
        this.balance=balance;
        this.owner=owner;
        
    }
    public Person getowner(){
        return owner;
    }
    public double getbalance(){
        return balance;
    }
    public double deposit(double amount){
        this.balance=amount + balance;
        return balance;
    }
    public double withdraw(double withdraw){
        this.balance= balance-withdraw;
        return balance;
        
    }
    public void transfer(double amount, BankAccount account){
       withdraw(amount);
       account.deposit(amount);
       System.out.println("Transfer "+amount+" to "+account);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "number=" + number + ", owner=" + owner + ", balance=" + balance + '}';
    }

    
    
    
}
    
        
            
    
    
  
        
    
    

