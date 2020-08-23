/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author ayushranjan
 */
public class BankAccountApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*checking c = new checking("Ayush Ranjan","12345678",1500);
        c.show_info();
        
        c.withdraw(1000);
        savings s = new savings("Vikas Raunak","87654321",2000);
        s.show_info();
        s.deposit(500);
        */
         ArrayList<account> accounts = new ArrayList<>();
        String file = "/Users/ayushranjan/Desktop/original.csv";
        ArrayList<String[]> customer = utils.csv.read(file);
       
        for(String[] stra : customer )
        {
           String name =  stra[0];
           String ssn = stra[1];
           String account_type = stra[2];
            double amount = Double.valueOf(stra[3]);
           if(account_type.equals("Savings"))
           {
               accounts.add(new savings(name ,ssn,amount) );
           }
           else
           {
               accounts.add(new checking(name ,ssn ,amount));
           }
        }
        //accounts.get(5).show_info();
        for( account acc :accounts)
        {
            acc.show_info();
            System.out.println("***********");
        }
        
    }
    
}
