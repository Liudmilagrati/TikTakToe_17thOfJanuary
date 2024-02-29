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
    
    public static String[][]setupGridArray(){
       
        //initiliazing and display the grid. We will use an array with strings
        String [][] gridArray = new String [3][5];
        gridArray[0][0] = "_";
        gridArray[0][1] = "|";
        gridArray[0][2] = "_";
        gridArray[0][3] = "|";
        gridArray[0][4] = "_";
        
        gridArray[1][0] = "_";
        gridArray[1][1] = "|";
        gridArray[1][2] = "_";
        gridArray[1][3] = "|";
        gridArray[1][4] = "_";
        
        gridArray[2][0] = " ";
        gridArray[2][1] = "|";
        gridArray[2][2] = " ";
        gridArray[2][3] = "|";
        gridArray[2][4] = " ";
        
        return gridArray;  
    }
    
    //method to display the grid
    public static void  displayGrid(String[][] gridArray) {
        for (int row=0; row<gridArray.length; row++) {
            
            for (int col=0; col<gridArray[row].length; col++){
                System.out.print(gridArray[row][col]);
            }
            System.out.println(""); // to have an emty line between rows 
        }     
    }

    // method to update the grid 
    // we will need gridArray- grid , int[][] position- whats been uodated , String letter - whats nbeen updated too 
    //for convinice position will refer 3 by 3, how the user will conceptuliase it

    public static void updateGrid(String[][] gridArray, int[] position, String letter) {
       
        //Position 3x3 and needs the player needs 
        //position = {2, 0}
        gridArray[position[0]][2*position[1]] = letter; // only even cols - use 2*n+1 for only add columns
        /*
        position 
        0 1 2 
        0 1 2 
        0 1 2 
        
        grid
        x|x|x - we want to skip every second element | that's why we multiply by 2
        01234 - positions
        
        */
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] gridArray = setupGridArray(); //creating the methods we will keep just teh b=usiness logic in main mathod 
        
        // call function on grid array method to display teh grid 
         displayGrid(gridArray); 
         
         //call update grid method  and declare it as new int array
         updateGrid(gridArray, new int[] {0, 0}, "X");
         displayGrid(gridArray); 
         System.out.println("");
         updateGrid(gridArray, new int[] {1, 2}, "O");
         displayGrid(gridArray); 
        
        
    }
    
}
