/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiktaktoe_17thofjanuary;

/**
 *
 * @author user
 */
public class Gridd24__24thOfJanuary {
    
    private int height;
    private int width;
    
    private String[][] gridArray;

    //create a constructor 
    public Gridd24__24thOfJanuary() {
        this.height = 3;
        this.width = 3;
        
        //initialise teh grid Array
        gridArray = setupGridArray();
    }

     //Constructor to let  to overwrite if they want to 
    public Gridd24__24thOfJanuary(int height, int width) {
        this.height = height;
        this.width = width;
        //initialise the grid Array
        gridArray = setupGridArray();
    }
    
 
    
  
    
    //method to display the grid
    public void  displayGrid() {
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

    public  void updateGrid( int[] position, String letter) {
       
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
    
    //we will make the setup grid private as we don't want anyone that uses our code to accidently 
    // refactor it 
       private  String[][]setupGridArray(){
       
        //initiliazing and display the grid. We will use an array with strings
        String [][] gridArray = new String [height][2*width-1]; //we changed from 3 and 5 to height and 2*width. Makes it the third odd number 
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
    
    
    
}
