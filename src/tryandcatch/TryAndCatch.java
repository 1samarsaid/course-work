/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryandcatch;

/**
 *
 * @author Christian Rusipa
 */
public class TryAndCatch {

    /**
     * @param args the command line arguments
     */
    //this program shows the exception when you try
    public static void main(String[] args) {
            try{  
          int data=50/0; //division of a number by zero,impossible  
       }
            catch(ArithmeticException e){System.out.println(e);} 
           int data=50/5;
       System.out.println("50 divided by three : "+data);
    }  
    }  

     ;  
        // TODO code application logic here
    
  
