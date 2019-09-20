/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.test;

/**
 *
 * @author Way4ward
 */
public class CodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(getFirstName());
    }
    
    
   private static String getFirstName(){
    String surnamE = "";
    String getFullname = "ADEFUWA OLUWAPONMILE HUSSEIN";
    String[] arr = getFullname.split(" ");
   for(int ij = 0; ij <arr.length ; ij++){
       surnamE = arr[1];
   }
   return surnamE;
    }
}
