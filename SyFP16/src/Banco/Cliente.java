/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class Cliente {
    private int numcuenta;
    private int numcliente;
    private int saldo;

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getNumcliente() {
        return numcliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public Cliente(int numcuenta, int numcliente, int saldo) {
        this.numcuenta = numcuenta;
        this.numcliente = numcliente;
        this.saldo = saldo;
    }
    
   
    

    
}
