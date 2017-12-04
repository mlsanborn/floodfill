import java.util.*;
// maggie sanborn
// 12/2/17 ((im so sorry))
// floodfill
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE]; // fills 10 x 10 with 0's
   boolean cont = true;
   boolean up = true; boolean down = true; 
   boolean left = true; boolean right = true; // setting everything to true to start
   
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int col) // (row, col) is the coordinate it starts at probably  // (3,4) is the demo
   {
       int num = 1; // number its on
       
       
       //pixels[row][col] = 1;
       pixels [row][col] = num;
       num++;
       
       while ( cont == true )
       {
             
            if ( row <= 0 || col <= 0 || row >= 9 || col >= 9 ){ // if any are out of bounds, check if can go
                
                if ( row <= 0 ) {up = false;} // if the row is on or less than the border, dont go up you dont have anywhere to go
                else if ( pixels[row-1][col] != 0 ) {up = false;} // if it can still go up, check to see if the space is open
                else {up = true;} // good to go pal
                if ( row >= 9 ) {down = false;}
                else if ( pixels[row+1][col] != 0 ) {down = false;}
                else {down = true;}
                if ( col <= 0 ) {left = false;}
                else if ( pixels[row][col-1] != 0 )  {left = false;}
                else{left = true;}
                if ( col >= 9 ) {right = false;}
                else if ( pixels[row][col+1] != 0 )  {right = false;}
                else{right = true;}
                
            }
            
           
            if (up == true){ 
                pixels [row-1][col] = num;
                num++;
            }
            if (right == true) {
                pixels [row][col+1] = num;
                num++;
            }
            if (down == true){
                pixels [row+1][col] = num;
                num++;
            }
            if (left == true) {
                pixels [row][col-1] = num;
                num++;
            }
            
            if (num > 100)      {cont = false; System.out.print(" 1");} // dont go more than 100 please for the love of god
            else if (left == true) {col--;System.out.print(" 5");} 
            else if (up == true) {row--;System.out.print(" 2");} 
            else if (right == true)  {col++;System.out.print(" 3");} 
            else if (down == true)  {row++;System.out.print(" 4");}
            else{cont = false;}
            //else                                          {cont = false;System.out.print("hi6");} // if none open, stop
            
          
            
            
            //System.out.print("help"+num);
        }
       
   }
   
   @Override
   public String toString()
   {
      String r = "\n";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}













