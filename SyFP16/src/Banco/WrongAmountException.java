/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Karen
 */
public class WrongAmountException extends Exception {

    public WrongAmountException(String message) {
        super(message);
    }

    public WrongAmountException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
    
}
