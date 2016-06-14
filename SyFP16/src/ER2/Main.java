/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author Karen
 */
public class Main {
    public static void main(String[] args) {
        
        ArchivoTexto c= new ArchivoTexto();
        ArchivoBinario b = new ArchivoBinario();
        ArchivoImagen e = new ArchivoImagen();
        String s= c.abrirArchivo(" no se abre",s);
        System.out.println(s);
        c.cerrarArchivo(s);
        String i= c.cerrarArchivo(s);
        System.out.println(i);
        
       

}
    }
    

