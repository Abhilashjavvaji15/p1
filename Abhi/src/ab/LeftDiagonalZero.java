package ab;

class LeftDiagonalZero
{
	 public static void main(String[] args) {
	        int n = 3; // size of the matrix
	        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }

	        // Printing the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
