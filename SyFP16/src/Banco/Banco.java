/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karen
 */
public class Banco {
    List<Cliente> cliente;
    List<Cuenta> cuenta;
    
    public Banco(){
        cliente = new ArrayList();
        cuenta = new ArrayList();
        
    }
    
    public void agregarCliente(Cliente Pepe){
        cliente.add(Pepe);
    }
    
    public void guardarClientes(){
        try(BufferedWriter bw = new BufferedWriter( new FileWriter("clientes.txt",true))){
            for(Cliente cl : cliente ){
                bw.write(cl.getNumcliente()+" "+ cl.getNumcuenta()+" "+ cl.getSaldo()+"\n");
            }
            
        } catch (IOException ex) {
            
        }
        
    }
    
    public void guardarCuentas(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("cuentas.txt",true))){
            
            
        } catch (IOException ex) {
            
        }
   
            
        }
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = new Cliente(1,2,200);
        b.agregarCliente(c);
        
        
    }
}
