/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

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
public class AbstractTableModel2 extends AbstractTableModel {
    String nombreArchivo;
    
    public int contarRenglon() {
        BufferedReader  n = null;        
        String row[];
        i = 0;
        String linea;
                
            try {
            n = new BufferedReader(new FileReader(nombreArchivo));
            linea = n.readLine();
            while(linea != null){                            
                i = i + 1;
                linea = n.readLine();         
        }
            } catch (IOException ex) {
                System.out.println("LEER");
            }
            
            return i;
    }
    
    public int contarColumnas(){
        BufferedReader l = null;
        String linea;
                               
        
            try {
                l = new BufferedReader(new FileReader(nombreArchivo));
                linea = l.readLine();
                row = linea.split(",");
                i = row.length;
                
            } catch (IOException ex) {
                System.out.println("CONTAR");
            }
        
        
        return i;
   }
    
        
    int i = 0;
    String row[];                     
              
    
    
    String[][] matriz;

    public AbstractTableModel2(String kmnjk) throws IOException {
        nombreArchivo = kmnjk;
        BufferedReader  bf = null;
        matriz = new String[contarRenglon()][contarColumnas()];
        String row[];
        int i = 0;
                
        try{
            bf = new BufferedReader(new FileReader(nombreArchivo));
            String linea = bf.readLine();
            while(linea != null){
                row = linea.split(",");
                matriz[i] = row;
                i = i + 1;
                linea = bf.readLine();            
        }
        } catch (FileNotFoundException ex){
            System.out.println("blah");
        }
        
        
    }
    
    

    AbstractTableModel2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return contarRenglon();
    }

    @Override
    public int getColumnCount() {
        return contarColumnas();
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return matriz[rowIndex][columnIndex];
    }
    
    
}
