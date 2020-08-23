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
public class checking extends account  {
   private static int dno = 100;
    private long debit_no;
   private int debit_pin ;
   private double checking_rate ;
    public checking(String name,String ssn,double deposit)
    {
        super(name,ssn,deposit);
        super.acc_no = 2+ super.acc_no ;
        set_debit_card();
       // System.out.println("Checking Account Created with Account Number : "+ acc_no);
        
    }
    public void show_info()
    {
        super.show_info();
        System.out.println("Checking Account ");
        System.out.println("Debit Card Number :" + this.debit_no +"\t Debit Pin :"+ this.debit_pin);
        System.out.println("Checking Rate : "+ this.checking_rate);
    }
    private void set_debit_card()
    {
        dno++;
        this.debit_no =(long) ((Math.random()*Math.pow(10, 9)))*1000 + dno;
        this.debit_pin = (int )(Math.random()* Math.pow(10, 4));
    }
    protected  void  set_rate(double rate)
    {
        this.checking_rate = rate * 0.15 ;
    }
}
