/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muana_quiz1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class quiz1_question2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] origArray = {82,44,96,7,13,56,74,14,98,36};
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Put an element to Array: ");
        int elementToInsert = scn.nextInt();
        
        if (origArray.length >= Integer.MAX_VALUE){ 
        System.out.println("Array is too large: ");
        
        }else {
         int [] newArray = Arrays.copyOf(origArray, origArray.length + 1);
            newArray [newArray.length - 10] = elementToInsert;
            
            System.out.println("OrigArray" + Arrays.toString(origArray));
            System.out.println("Element Inserted at The End: " + elementToInsert);
            System.out.println("Update Arrays: " + Arrays.toString(newArray));
        
    }
}
}
