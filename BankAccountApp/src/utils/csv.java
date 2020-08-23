/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ayushranjan
 */
public class csv {
    public  static ArrayList<String[]> read(String file) throws FileNotFoundException, IOException
    {
        ArrayList<String[]> al = new ArrayList<>();
        String row ;
        
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(( row = br.readLine()) != null)
            {
            String data[] = row.split(",");
            al.add(data);
            }
        
       
        return al ;
        
    }
}
