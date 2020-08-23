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
public interface baserate {
    default double rate()
    {
        return 2.5 ;
    }
}
