public class Grid
{
   private static final int SIZE = 10;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
   int[][] pixels = new int[SIZE][SIZE]; // fills 10 x 10 with 0's
   Stack<Integer> fill = new Stack<>();
   boolean cont = true;
   boolean up = true; boolean down = true; 
   boolean left = true; boolean right = true; // setting everything to true to start
   
   int count = 1 ;
   int temp = 0;
   int r = 0;
   int c = 0;
   
=======
   int[][] pixels = new int[SIZE][SIZE];
   . . .

>>>>>>> parent of 01e074b... hkfhtsjyrj
=======
   int[][] pixels = new int[SIZE][SIZE];
   . . .

>>>>>>> parent of 01e074b... hkfhtsjyrj
=======
   int[][] pixels = new int[SIZE][SIZE];
   . . .

>>>>>>> parent of 01e074b... hkfhtsjyrj
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
       int start = ((row) * 10) + (col) ; // where to start in stack
       fill.push(start); 
       
       while ( cont )
       {
             
            if (count < 100){
                if (fill.contains(start - 10))  {up = false;}
                if (fill.contains(start + 1))   {right = false;}
                if (fill.contains((start + 10))){down = false;}
                if (fill.contains(start - 1))   {left = false;}
            }
            
           
            if ((start - 10) > 0 && up){
                temp = fill.peek();
                r = temp / 10;
                c = temp % 10;
                pixels[r][c] = count;
                start -= 10;
                fill.push(start);
            }else if( !((( start + 1 ) % 10) == 0) && right ){
                temp = fill.peek();
                r = temp / 10;
                c = temp % 10;
                pixels[r][c] = count;
                start += 1;
                fill.push(start);
            }else if ( (start + 10) < 100 && down ){
                temp = fill.peek();
                r = temp / 10;
                c = temp % 10;
                pixels[r][c] = count;
                start += 10;
                fill.push(start);
            }else if(!(((start-1)%10) == 9) && ((start-1) > -1) && left){
                temp = fill.peek();
                r = temp/10;
                c = temp%10;
                pixels[r][c] = count;
                start -= 1;
                fill.push(start);
            }else{start = 1000;}
            
            up = true; right = true; down = true; left = true; // reset all
            
            if (count >= 100) {cont = false;}
            
            count++;
            
            //System.out.print("help"+num); // test
        }
       
=======
      . . .
>>>>>>> parent of 01e074b... hkfhtsjyrj
=======
      . . .
>>>>>>> parent of 01e074b... hkfhtsjyrj
=======
      . . .
>>>>>>> parent of 01e074b... hkfhtsjyrj
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
