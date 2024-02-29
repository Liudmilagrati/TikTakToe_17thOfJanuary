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
        
        Grid grid = new Grid();
        
        //24/01 we don't need this anymore String[][] gridArray = setupGridArray(); //creating the methods we will keep just teh b=usiness logic in main mathod 
        
        // call function on grid array method to display teh grid 
         grid.displayGrid(); 
         
         //call update grid method  and declare it as new int array and display teh updates 
         grid.updateGrid( new int[] {0, 0}, "X");
         grid.displayGrid(); 
         System.out.println("");
         grid.updateGrid( new int[] {1, 2}, "O");
         grid.displayGrid(); 
         
         
        
       
         
    } 
}
