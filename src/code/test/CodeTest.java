/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.test;

import help.Way4wardHelper;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Way4ward
 */
public class CodeTest {

    /**
     * @param args the command line arguments
     */
    
static String aThousand = "10000";
static String fifThousand ="50000";
static String hudThousand = "100000";
static String defaulT = "default"; 

  public static void main(String[] args) {
  System.out.println(getFirstName());
  int salary = 50000;
       
  double forty = 40.0/100.0 * salary;
  System.out.println(forty);
        
        
  String baba = "name babe";
  String b =   baba.replace(baba, "babe");
  System.out.println(b);
  if(baba.contains("babe")){
      System.out.println("contain");
  }
    }
    
//THIS METHOD ACCEPTS STRING(SENTENCE) AND SPLIT IN SPACES.
//USEAGE
//1. It can be used to accept a fullname and extract the surname.    
   private static String getFirstName(){
    String surnamE = "";
    String getFullname = "ADEFUWA OLUWAPONMILE HUSSEIN";
    String[] arr = getFullname.split(" ");
   for(int ij = 0; ij <arr.length ; ij++){
       surnamE = arr[1];
   }
   return surnamE;
    }
   
   
private static void getCode(){
    Way4wardHelper w = new Way4wardHelper();
ArrayList<String> list = new  ArrayList<>();
    int a = (int) (Math.random() * 3 + 1);
    Random rd = new Random();
     for(int i = 1; i <= 150;i++){
    if(a == 1){
      String range = w.randomRange(600, 900);
      if(list.contains(range)){
         list.remove(range);
      }else{
        list.add(range);  
      }
//     }else if(a == 2){
//          String range = w.randomRange(200, 400);
//      if(list.contains(range)){
//       list.remove(range);
//      }else{
//        list.add(range);  
//      }
//        
//        
//    }else if(a == 3){
//       String range = w.randomRange(400, 700);
//      if(list.contains(range)){
//          list.remove(range);
//      }else{
//        list.add(range);  
//      }
//        
        
    }
            }
     System.out.println(list);
 
}
  private static String cost(String cost){
         if (cost.equals("<"+aThousand)){
             cost = aThousand;
 }else if(cost.equals("<"+fifThousand)){
     cost = fifThousand;
 }else if(cost.equals("<"+hudThousand)){
     cost = hudThousand;
 }else if(cost.equals("default")){
     cost = defaulT;
 }
        return cost;
    }
  
//FIBONACCI SERIES METHOD
private static void fibonacci(){
    int fabo[] = new int[10];
     fabo[0] = 0;
       fabo[1] = 1;
       int sum;
      System.out.println("Declared "+fabo[0]);
        System.out.println("Declared "+fabo[1]);
    for(int i = 2;  i < fabo.length; i++){
      fabo[i] = fabo[i - 1] + fabo[i - 2];
      
        
           System.out.println(fabo[i]);
    }
 
}
public static String[] verify(String getQuestion){
String[] arr = getQuestion.split(" ");
 return arr;
}

private static void locateSequence(int [] num){
          int value;
          int firstnum ;
          int secondnum;
      int diff[] = new int[num.length] ;
      //This is to check if the array is empty
      if(num.length < 1){
            
      }else{
      //Else if it is not empty
      //Find the differences of all element in the array
      for(int i=0;  i+ 1 < num.length ; i++){
      value = num[i] - num[i+1];
      diff[i] = value;
      //All the element would be stored in the array diff[]
       }
      
      //Now, compare all the differences if there is a sequences
      for(int i=0;  i+ 1 < diff.length; i++){
          firstnum = diff[i];
          secondnum = diff[i+1];
      if(firstnum == secondnum){
      //If there is a sequences print out the first element to start the sequence
      System.out.println("Result: "+diff[i]);
          }
        }
    
      }
    }
    
    
    private static void findAgain(int [] target, int [] array){
          int value;
          int firstnum ;
          int secondnum;
      int diff[] = new int[target.length] ;
      //This is to check if the array is empty
      if(target.length < 1){
            
      }else{
      //Else if it is not empty
      //Find the differences of all element in the array
      for(int i=0;  i+ 1 < target.length ; i++){
      value = target[i] - target[i+1];
      diff[i] = value;
      //All the element would be stored in the array diff[]
       }
      
      //Now, compare all the differences if there is a sequences
      for(int i=0;  i+ 1 < diff.length; i++){
          firstnum = diff[i];
          secondnum = diff[i+1];
      if(firstnum == secondnum){
      //If there is a sequences print out the first element to start the sequence
      array[0] = (diff[i]);
          }
      array[i+1] =diff[i]+1;
      System.out.println(array[i]);
        }
    
      }
    }
    
private static void split(){ 
    String catchIt = null;
    String temp ="";
    String[] ignore = {"design","and","implementation", "father"};   
    System.out.println("Enter the sentense");
    Scanner baba = new Scanner(System.in);
    String  s = baba.nextLine();
    String[] arr = s.split(" ");
    
    System.out.println("Value to search from: ( and , design , implementation , father )");
    System.out.println("Search for: "+s);
    
    for(int ij = 0; ij <arr.length ; ij++){
         System.out.println(""+(ij+1)+" Parse: "+arr[ij]);
                for(int j =0; j < 1; j++){
    if(!arr[ij].equals(ignore[j])){
           System.out.println("Comparing "+j+" "+arr[ij] +" with "+ignore[j]);
        
         //put database
    }else{
        temp = arr[ij];
         System.out.println("Found: "+temp);
         break;
    } 
}
            }
   
    
}
}