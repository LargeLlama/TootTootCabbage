public class MFDriver {
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
		for(int i = 50; i < 10000; i+=50){
			for(int j = 0; j < 100; j++){
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
				curr = System.nanoTime();
				MatrixFinder.linSearch(matrix, target);
				sum += System.nanoTime() - curr;
			}
			
			System.out.println(i + "," + sum);
			sum = 0;
		}
	}
}
