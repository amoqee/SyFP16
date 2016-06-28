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
    String[][] matriz;

    public AbstractTableModel2(String kmnjk) throws IOException {
        BufferedReader  bf = null;
        matriz = new String[101][6];
        String row[];
        int i = 0;
                
        try{
            bf = new BufferedReader(new FileReader(kmnjk));
            String linea = bf.readLine();
            while(linea != null){
                row = linea.split(",");
                matriz[i] = row;
                i = i + 1;
                linea = bf.readLine();            
        }
        } catch (FileNotFoundException ex) {
            System.out.println("blah");
        }
        
        
    }

    AbstractTableModel2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return 101;
    }

    @Override
    public int getColumnCount() {
        return 6;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return matriz[rowIndex][columnIndex];
    }
    
    
}
