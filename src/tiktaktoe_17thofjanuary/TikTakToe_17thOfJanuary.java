/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiktaktoe_17thofjanuary;

/**
 *
 * @author user
 */
public class TikTakToe_17thOfJanuary {
    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] gridArray = setupGridArray(); //creating the methods we will keep just teh b=usiness logic in main mathod 
        
        // call function on grid array method to display teh grid 
         displayGrid(gridArray); 
         
         //call update grid method  and declare it as new int array and display teh updates 
         updateGrid(gridArray, new int[] {0, 0}, "X");
         displayGrid(gridArray); 
         System.out.println("");
         updateGrid(gridArray, new int[] {1, 2}, "O");
         displayGrid(gridArray); 
         
         
        
       
         
    } 
}
