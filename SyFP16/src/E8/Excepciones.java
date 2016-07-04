/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

/**
 *
 * @author Karen
 */
public class Excepciones {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,};        
        for(int i = 0; i <= 5; i++){
            try{
                System.out.println(arr [i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("estas fuera de los limites");
                System.out.println(e.toString());
                
            }
                    finally{
                            cerrarArchivos;
                            }
                }
            }
        }
        
            
    
}
