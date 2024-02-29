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
        
        //display grid. We will use an array with strings
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
        
        for (int row=0; row<gridArray.length; row++) {
            
            for (int col=0; col<gridArray[row].length; col++){
                System.out.print(gridArray[row][col]);
            }
            System.out.println(""); // to have an emty line between rows 
        }
        
    }
    
}
