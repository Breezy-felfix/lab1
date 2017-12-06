/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class JavaLessonTesting {
    public static void main (String [] args) {
      try{
            checkAge(12);
      }catch(InvalidAgeException iae){
          System.out.println (iae.getMessage());
      }catch (Exception ex) {
      }
      }
       public static void checkAge (int age)throws InvalidAgeException{
           if (age<18){
               throw new InvalidAgeException("You must be 18");
                       }else{
               
                    
        
    }
    }
}