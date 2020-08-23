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
public class savings extends account {
    private static int safety_id = 100;
    private int safety_deposit_id;
    private int safety_deposit_key;
    private double saving_rate ;
    public savings(String name,String ssn,double deposit)
    {
        super(name,ssn,deposit);
        super.acc_no = 1 + super.acc_no;
        set_safety_deposit();
        
       // System.out.println("Saving Account Created  with Account Number : " + acc_no);
    }
    public void show_info()
    {
        
        super.show_info();
        System.out.println("Saving Account ");
        System.out.println("Safety ID :"+ this.safety_deposit_id + "\t Safety key : "+ this.safety_deposit_key);
        System.out.println("Saving Rate : "+ this.saving_rate);
        
    }
    private void set_safety_deposit()
    {
        this.safety_deposit_id = safety_id++;
        this.safety_deposit_key = (int)(Math.random() * 10000);
        
    }
     protected  void  set_rate(double rate)
     {
         this.saving_rate = rate - 0.25; 
     }
    
}
