/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karen
 */
public class TablaInventario extends AbstractTableModel{
    String id;
    String producto;
    int i = 0;
    
    
    public int contarFrame(){
        BufferedReader  n = null;        
        
        i = 0;
        String linea;
        
        
            try {
                new BufferedReader(new FileReader("products.csv"));
                linea = n.readLine();
                while(linea != null){
                    i = i + 1;
                    linea = n.readLine();
                    String[] row = linea.split(";");
                    i = row.length;
                    
                    if(row[4].equals("FRAME")){
                    i = i + 1;
                    
                }                                       
                    
                }
            } catch (FileNotFoundException ex) {
                System.out.println("");
            }
        return i;
        
        
     public int contarGlue(){
        BufferedReader  n = null;        
        
        i = 0;
        String linea;
        
        
            try {
                new BufferedReader(new FileReader("products.csv"));
                linea = n.readLine();
                while(linea != null){
                    i = i + 1;
                    linea = n.readLine();
                    String[] row = linea.split(";");
                    i = row.length;
                    
                    if(row[4].equals("GLUE")){
                    i = i + 1;
                    
                }                                       
                    
                }
            } catch (FileNotFoundException ex) {
                System.out.println("");
            }
        return i;
       
     
        
     public int contarPuzzle(){
        BufferedReader  n = null;        
        
        i = 0;
        String linea;
        
        
            try {
                new BufferedReader(new FileReader("products.csv"));
                linea = n.readLine();
                while(linea != null){
                    i = i + 1;
                    linea = n.readLine();
                    String[] row = linea.split(";");
                    i = row.length;
                    
                    if(row[4].equals("PUZZLE")){
                    i = i + 1;
                    
                }                                       
                    
                }
            } catch (FileNotFoundException ex) {
                System.out.println("");
            }
        return i;
        
        
     public int contarStorage(){
        BufferedReader  n = null;        
        
        i = 0;
        String linea;
        
        
            try {
                new BufferedReader(new FileReader("products.csv"));
                linea = n.readLine();
                while(linea != null){
                    i = i + 1;
                    linea = n.readLine();
                    String[] row = linea.split(";");
                    i = row.length;
                    
                    if(row[4].equals("STORAGE")){
                    i = i + 1;
                    
                }                                       
                    
                }
            } catch (FileNotFoundException ex) {
                System.out.println("");
            }
        return i;
        
    }
    
    
    

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
