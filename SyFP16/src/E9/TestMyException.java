/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class TestMyException {      
        public void test (String m) throws MyException
        {        
            if(m == null){
                new MyException("Mi excepcion fue lanzada");
        }
        else{
                System.out.println(m);  
        }
    }
        
    public static void main(String[] args) {
        TestMyException g = new TestMyException();
            try {
                g.test(null);
            } catch (MyException ex) {
                System.out.println(ex.toString());
            }
    }
}
