package problem1;

public class UnevenArra {
	public static void main(String args[]){
	    int matrix[][] = new int[3][];
	    matrix[0] = new int[2];
	    matrix[1] = new int[3];
	    matrix[2] = new int[4];

	    for(int row = 0; row < matrix.length; row++)
	      for(int col = 0; col < matrix[row].length; col++)
	        matrix[row][col] = row + col;

	    for(int row = 0; row < matrix.length; row++)
	      for(int col = 0; col < matrix[row].length; col++)
	        System.out.print(matrix[row][col] + " ");
	      
	    System.out.println("");
	  }
}
