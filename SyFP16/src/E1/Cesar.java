/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author Karen
 */
public class Cesar {
    
   public String cifrar(String mensaje, int constante){
       String resultado = "";
     
       for(int i=0; i<mensaje.length(); i++ )
       {
          if (mensaje.charAt(i)== 10){
          resultado = resultado + mensaje.charAt(i);}
          else{
              resultado = resultado + (char)(mensaje.charAt(i)+ constante);
          }
                  
       }
       return resultado;      
   }
    
    public static void main(String[] args) {
        Cesar c= new Cesar();
        String s= c.cifrar("hola", 5);
        System.out.println(s);
        c.descifrar(s, 5);
        String i= c.descifrar(s,5);
        System.out.println(i);
    }
        
       public String descifrar(String mensaje, int constante){
       String resultado = "";
     
       for(int i=0; i<mensaje.length(); i++ )
       {
           if (mensaje.charAt(i)== 10){
          resultado = resultado + mensaje.charAt(i);}
          else{
              resultado = resultado + (char)(mensaje.charAt(i)- constante);
          }
          //resultado = resultado + (char)(mensaje.charAt(i)- constante);
                  
                      
                  
       }
       return resultado;      
   }
    
   
        
    
}
