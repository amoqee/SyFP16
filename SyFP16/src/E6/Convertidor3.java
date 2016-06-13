/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Karen
 */
class Convertidor3 {
    
Map<String,Double> mapa; 
    public double convertir( String a ,double num ,String b){
        
        if(mapa.containsKey(a))
        {
            double cm = mapa.get(a);
            b = cm * num;
            double inch = mapa.get(num);
            return cm/inch;
            
        }
        
        return 0.0;
    
     
               
    }
    
    
    /**
     * Creates new form Convertidor
     */
    public Convertidor3() {
        mapa = new HashMap();
        mapa.put("Centimetros", 0.01);
        mapa.put("Metros", 1.00 );
        mapa.put("Kilometros", 1000.00);
        mapa.put("Pulgadas", 0.254);
        mapa.put("Pies", .305);
        mapa.put("Yardas", .919);
        mapa.put("Millas", 1613.00);
         
        
    
         
        
    }  
    
    public static void main(String[] args) {
        Convertidor3 c = new Convertidor3();
        double resultado = c.convertir("centimetros", 30, "pies");
        
        System.out.println(resultado);
    }
     
              
        
    }    
}
