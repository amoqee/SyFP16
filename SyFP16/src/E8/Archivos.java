/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class Archivos {
    public void leer () throws IOException {
        BufferedReader  br = null;
        try {
            
            br = new BufferedReader(new FileReader("ejemplo.txt"));
            String linea;
            linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex ) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("No puedo leer el archivo");
        }
        finally{
            br.close();
        }
        
        
        
    }
    
    public void escribir() throws IOException{
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter("ejemplo.txt",true));
            bw.write("van a reprobar");
            bw.close();
            
    }
    
    public static void main(String[] args) throws IOException {
        Archivos a = new Archivos();
        a.leer();
        a.escribir();
    }
   
}
