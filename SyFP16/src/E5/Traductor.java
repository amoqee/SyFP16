/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;
import java.util.List;
/**
 *
 * @author Karen
 */
public class Traductor {
    
    List<String> palabras;
    List<String> traducciones;
    
    public String traducir(String atraducir){                     
        
         int i= palabras.indexOf(atraducir); 
         return "bla";
    }   
    
      
            
    public void agregar(String k,String p){
        palabras.add(k);
        traducciones.add(p);
    
}
    
 public Traductor( ){
     
 }
         
 
    
}
