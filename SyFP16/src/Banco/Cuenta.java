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
public class Cuenta {
    double saldo = 0.0;
    public double checksaldo(double saldo){
        return saldo;
        
        
    }
    
    public void deposito(double a ){
        
        if(a <= 0) {
            new WrongAmountException ("Excepcion");
        }
        else{
             saldo = saldo + a;
        }
        
        
    }
    
    public void retiro(double b){
        
        if(b <=0){
            new SaldoInsuficienteException ("Saldo Insuficiente");
        }
        else{
            saldo = saldo - b;
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
