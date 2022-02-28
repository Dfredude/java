package chapter08;

public class AMatrixMultiplier {

	public static void main(String[] args) {
		int[][] matrix1 = {{2, 3}, {3, 4}, {4, 5}};
		int[][] matrix2 = {{2, 3, 4}, {3, 4, 5}};
		int len = matrix2.length;
		int[][] new_matrix = new int[len][len];
		
		int sum;
		for (int i = 0; i<len; i++ ) {
			for (int j = 0; j<len; j++) {
				sum = 0;
				for (int k = 0; k < matrix1.length; k++) {
					System.out.println(matrix1[k][i]+ " is multiplied by " + matrix2[j][k]);
					sum += (matrix1[k][i] * matrix2[j][k]); 
				}
				System.out.println("This round gave us: "+sum);
				new_matrix[i][j] = sum; 
				
			}
		}
		
		for (int i = 0; i<new_matrix.length; i++) {
			for (int j = 0; j<new_matrix[0].length; j++) {
				System.out.print(new_matrix[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
