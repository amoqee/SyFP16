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
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karen
 */
public class TablaInventario extends AbstractTableModel {

    
    int i = 0;
    private String m[][];
    private String names[];
    private String nombreArchivo;
    int cFrame = 0, cGlue = 0, cPuzzle = 0, cStorage = 0;

    //Lee el archivo y cuenta los objetos
    public void leerArchivo() {
        
        try {
            File archivo = new File(nombreArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader (fr);
            
            String linea = null;
            String [] arregloLinea = null;
            
            Map mapa = new HashMap<String, Integer>();
            mapa.put("FRAME", cFrame);
            mapa.put("GLUE", cGlue);
            mapa.put("PUZZLE", cPuzzle);
            mapa.put("STORAGE", cStorage);
            
            linea = br.readLine();
            while(linea != null){
                arregloLinea = linea.split(";");
                switch(arregloLinea[4]){
                    case "FRAME": cFrame++;
                    break;
                    case "GLUE": cGlue++;
                    break;
                    case "PUZZLE": cPuzzle++;
                    break;
                    default: cStorage++;
                    break;
                    
                }
            }
        }catch(Exception e){}
    }
    
    public int getFrame(){
        return cFrame;
    }

    public int getcGlue() {
        return cGlue;
    }

    public int getcPuzzle() {
        return cPuzzle;
    }

    public int getcStorage() {
        return cStorage;
    }
    
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        return 5;
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
