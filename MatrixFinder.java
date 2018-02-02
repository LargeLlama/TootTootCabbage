//Team Toot Toot Cabbage - Rubin Peci, Andrew Shao, Bill Ni

public class MatrixFinder {
	
	public static String linSearch(int[][] matrix, int desiredValue) {
		int currentRow = 0;
		int currentColumn = matrix.length - 1;

		String retString = "(-1, -1)";

		while (currentColumn >= 0 && currentRow < matrix.length) {
			if (matrix[currentRow][currentColumn] == desiredValue){
				retString = "(" + currentRow + ", " + currentColumn + ")";
				break;
			}
			else if (matrix[currentRow][currentColumn] < desiredValue)
				currentRow++;
			else
				currentColumn--;
		}

		return retString;
	}

	public static int[][] randomMatrixGen(int size){
		int[][] rtrnArr = new int[size][size];
		int lim = size;

		for(int r = 0; r < size; r++){
			for(int c = 0; c < size; c++){
				if(r == 0 && c == 0){
					rtrnArr[r][c] = rtrnRandom(lim);
				}else if(r == 0){
					rtrnArr[r][c] = rtrnArr[r][c-1] + rtrnRandom(lim);
				}else if(c == 0){
					rtrnArr[r][c] = rtrnArr[r-1][c] + rtrnRandom(lim);
				}else{
					if(rtrnArr[r-1][c] > rtrnArr[r][c-1]){
						rtrnArr[r][c] = rtrnArr[r-1][c] + rtrnRandom(lim);
					}else{
						rtrnArr[r][c] = rtrnArr[r][c-1] + rtrnRandom(lim);
					}
				}
			}
		}

		return rtrnArr;
	}

	public static int rtrnRandom(int lim){
		return ((int)(Math.random() * lim + 1));
	}

	public static void main(String[] args) {
		int[][] matrix;
		int target = 0;
		long curr = 0;
		int sum = 0;
		for(int i = 1; i < 11; i++){
			for(int j = 0; j < 1000; j++){
				target = rtrnRandom(i * i);
				//System.out.println();
				matrix = randomMatrixGen(i);
				// for(int[] r : matrix){
				// 	for(int c : r){
				// 		System.out.print(c + "  ");
				// 	}
				// 	System.out.println();
				// }
				//System.out.println(target);
				curr = System.currentTimeMillis();
				linSearch(matrix, target);
				sum += System.currentTimeMillis() - curr;
			}
			System.out.println(sum);
		}
	}
}