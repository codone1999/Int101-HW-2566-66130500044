/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;
import java.util.Objects;
import work02.Person;
import work01Utilitor.Utilitor;
/**
 *
 * @author Codone
 */
public class Account {
    private static long nextNo = 100_000_000;
    private Person owner;
    private double balance;
    private final long no;
    public Account(Person owner){
        if(owner==null){
            throw new NullPointerException("owner is null");
        }
        this.balance=0.0;
        do {
            long result = Utilitor.computeIsbn10(nextNo);
            if (result == 10) {
                nextNo++;
                continue;
            }

            this.no = 10 * nextNo + result;
            nextNo++;
            break;
        } while (true);
        
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public long getNo() {
        return no;
    }
    public double deposit(double amount){
        Utilitor.testPositive(amount);
        return balance += amount;
    }
    public double withdraw(double amount){
        Utilitor.testPositive(amount);
        Utilitor.testPositive(this.balance);
        return balance -= amount;
    }
    public void transfer(double amount,Account account){
        if(account==null || account.withdraw(amount)<0 ){
            throw new IllegalArgumentException("if account is null or it cannot withdraw the amount from this object");
        }
        this.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", no=" + no + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        if (this.no != other.no) {
            return false;
        }
        return Objects.equals(this.owner, other.owner);
    }
   
}
