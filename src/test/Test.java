/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           String input = "9";
       
        int user_input=Integer.parseInt(input);
    }catch(NumberFormatException nfe) {
        System.out.println(nfe.getMessage());
    }
    
    }}
