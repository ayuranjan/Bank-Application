/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author ayushranjan
 */
public abstract class account  implements baserate{
   static int index = 10000;
    private String name ;
    private String SSN;
    private double balance ;
    protected  String acc_no ;
    protected double rate ;
    public account(String name,String ssn,double deposit)
    {
        this.name = name ;
        this.SSN = ssn;
        this.balance = deposit;
        index++;
        this.acc_no = set_account_no();
        this.rate = rate();
        set_rate(rate);
        
    }
    private String set_account_no()
    {
        String last2 = this.SSN.substring(this.SSN.length()-2,this.SSN.length());
        int random =(int)(Math.random()*1000);
        return last2+index+random;
    }
    public void show_info()
    {
        System.out.print("Name : "+ name+"\t SSN :"+ this.SSN + "\tBalance: "+this.balance +"\t Account Number : " + acc_no+"\t Account Type : " );
    }
    protected  abstract void  set_rate(double rate);
    public void deposit(double amount )
    {
        this.balance = this.balance + amount;
        System.out.println("Depositing Amount : " + amount);
        print_balance();
        
    }
    public void withdraw(double amount )
    {
        this.balance = this.balance - amount;
        System.out.println("Withdrawn  Amount : " + amount);
        print_balance();
    }
    public void print_balance ()
    {
        System.out.println("Your Current Balance is : " + this.balance);
    }
    
}
