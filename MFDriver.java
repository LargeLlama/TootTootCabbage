//Team TootTootCabbage
//Wubin Peco
//Bill Ni the Science Guy
//Andrew Shao-lin Monk

//lab00 - Ma che cosa i dati dicono?

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
		
		int[][] matrix;	//store the matrix we want to search
		int target = 0;	//store the random value we want to find
		long curr = 0;	//store the time in nanoseconds
		
		int sum = 0;	//store the sum of the time in nanoseconds

		for(int i = 50; i < 10000; i+=500){
			for(int j = 0; j < 10; j++){
				target = rtrnRandom(i * i);		//get random int value that can be in the matrix

				matrix = randomMatrixGen(i); 	//generate the random matrix
			
				curr = System.nanoTime();		//store the current time
				MatrixFinder.linSearch(matrix, target); //run our algorithm
				sum += System.nanoTime() - curr; 		//calc the diff in time to get the time elapsed
			}
			sum = sum / 100; //this is because we ran 100 trials and we want the average for ONE trial	
			System.out.println(i + "," + sum);	//print out the data in a .csv friendly format
			sum = 0;	//reset the value of sum
		}
	}
}
