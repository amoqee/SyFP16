/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import java.util.ArrayList;

/**
 *
 * @author Karen
 */
public class Productos {
    
    ArrayList inventario = new ArrayList();
    ArrayList compra = new ArrayList();
    int jabon;
    int pasta;
    int champu;
    int papel;

    public ArrayList getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList inventario) {
        this.inventario = inventario;
    }

    public ArrayList getCompra() {
        return compra;
    }

    public void setCompra(ArrayList compra) {
        this.compra = compra;
    }

    public int getJabon() {
        return jabon;
    }

    public void setJabon(int jabon) {
        this.jabon = jabon;
    }

    public int getPasta() {
        return pasta;
    }

    public void setPasta(int pasta) {
        this.pasta = pasta;
    }

    public int getChampu() {
        return champu;
    }

    public void setChampu(int champu) {
        this.champu = champu;
    }

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }
    
    
    
    
}
