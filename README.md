# TootTootCabbage 
### Rubin Peci, Andrew Shao, Bill Ni 
 

## Background: 
We are trying to determine whether our matrix finder algorithm is *O(n)* time or not

####Algorithm  
1. Start from the top right corner of the matrix  
2. If the value at the current index is less than the desired value, go to the next column.  
   Else, we go down the row.  
3. Repeat step 2 until the value is found or we reach the end of the matrix.


## Hypothesis:
Empirical runtime would be approximately linear with some possible discrepancies.  
Essential, the algorithm will run in *O(n)* time, where the amount of time it takes for the algorithm to run increases linearly with the size of the matrix.
 
 
## Test Methodology: 
 
We start with a *50x50* matrix, and run 100 trials of our algorithm, keeping track of how long it took to run and dividing that by 100 to get the average time.
We then increment the size of the array by 50  
For example, the next run would be 100 trials of a 100x100 matrix, and then 100 trials of a 150x150 matrix...  
And so on and so forth until we reach an matrix of size 10,000.  
  
These will be outputted to a .csv file, which is stored in the folder raw_data

## Results
 

## Conclusions
