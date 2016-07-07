/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karen
 */
public class FormaPago extends AbstractTableModel{
    
    int i = 0;
    private String m[][];
    private String names[];
    private String nombreArchivo;
    int cAmex = 0, cCash = 0, cChec = 0, cMast = 0, cOthe = 0, cVisa =0 ;
    
    public void leerArchivo() {
        
        try {
            File archivo = new File(nombreArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader (fr);
            
            String linea = null;
            String [] arregloLinea = null;
            
            Map mapa = new HashMap<String, Integer>();
            mapa.put("AMEX", cAmex);
            mapa.put("CASH", cCash);
            mapa.put("CHEC", cChec);
            mapa.put("MAST", cMast);
            mapa.put("OTHE", cOthe);
            mapa.put("VISA", cVisa);
            
            linea = br.readLine();
            while(linea != null){
                arregloLinea = linea.split(";");
                switch(arregloLinea[4]){
                    case "AMEX": cAmex++;
                    break;
                    case "CASH": cCash++;
                    break;
                    case "CHEC": cChec++;
                    break;
                    case "MAST": cMast++;
                    break;
                    case "OTHE": cOthe++;
                    break;
                    
                    default: cVisa++;
                    break;
                    
                }
            }
        }catch(Exception e){}
    }

    @Override
    public int getRowCount() {
        
    }

    @Override
    public int getColumnCount() {
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
