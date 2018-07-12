// 文件名称 CheckingAccount.java
import java.io.*;
import java.rmi.RemoteException;

public class CheckingAccount
{
    private double balance;
    private int number;
    public CheckingAccount(int number)
    {
        this.number = number;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException
//    public void deposit(double amount) throws RemoteException
    {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}