// Galip Cagan
// Martini Glass Problem
// January 4, 2018

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
// Printing '0's by using recursion 
  public static String printZero(int value){
    if(value == 1){
    return "0";
    }
    else{
      return("0"+ (printZero(value-1)) + "0");
   }
  }
// Printing the triangle with multiple prints of '0's
  public static void triZero(int value){
    int counter = 0;
    for(int i=value; i>0 ; i--){
      String str1 = printZero(i);
      System.out.println(str1);
      counter++;
      if(counter == value){
      break;
      }
        for(int k=0; k<counter; k++){
        System.out.print(" ");
      }
    }
}
// Printing '|' by using for loops
  public static void printOr(int value){
    for(int k = 0; k< value; k++){
      for(int i = 1 ; i < value ; i++){
        System.out.print(" ");
      }
    System.out.print("|\n");
    }
  }
  
 /// Printing '=' by using recursion
  public static String printEqual(int value){
    if(value == 1){ // base case for recursion
    return "=";
    }
    else{ //the way to iterate
      return("="+ (printEqual(value-1)) + "=");
   }
  } 
  
// Calls alls the functions and checks if value is appropriate or not  
 public static void printGlass(int value){

   if(value > 0){   //check statement
     triZero(value); // printting '0's
     printOr(value); // printing '|' s
     String str3 = printEqual(value);
     System.out.println(str3); // printing '='
  }
   else // this is an error as there shouldn't be any value below or equal to 0
     System.out.println("Can't make a martini glass");

 }
 public static void main (String[] args) throws java.lang.Exception
 {// Test Cases
   System.out.println("[Test0]:");
   printGlass(0);
   System.out.println("[Test1]:");
   printGlass(1);
   System.out.println("[Test2]:");
   printGlass(2);
   System.out.println("[test3]:");
   printGlass(3);
   System.out.println("[Test4]: ");
   printGlass(4);
   System.out.println("[Test5]: ");
   printGlass(5);

 }
}