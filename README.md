# TootTootCabbage 
### Rubin Peci, Andrew Shao, Bill Ni 
 

## Background: 
We are trying to determine whether our matrix finder algorithm is *O(n)* time or not

#### Algorithm  
1. Start from the top right corner of the matrix  
2. If the value at the current index is less than the desired value, go to the next column.  
   Else, we go down the row.  
3. Repeat step 2 until the value is found or we reach the end of the matrix.


## Hypothesis:
Empirical runtime would be approximately linear with some possible discrepancies.  

Essentially, the algorithm will run in *O(n)* time, where the amount of time it takes for the algorithm to run increases linearly with the size of the matrix.  

 
 
## Test Methodology: 
 
We start with a *50x50* matrix, and run a various number of trials of our algorithm, keeping track of how long it took to run and dividing that by 100 to get the average time.  

We then increment the size of the array by 50  
For example, the next run would be 100 trials of a 100x100 matrix, and then 100 trials of a 150x150 matrix...    

And so on and so forth  
We reached a variety of sizes, which can all be seen in our *raw_data* file
All sizes were >= 3000, with the maximum being 6600
Past this point, our machines took too long to actually print the data (we were running up to 100 trials for each size at one point)
  
These will be outputted to a .csv file, which is stored in the folder *raw_data*

## Results  
All of our results can be seen organized [here] (https://docs.google.com/spreadsheets/d/1XvStXDj2gqjJ0mAwMfi8f4sbaL79i_ZEd0IYBT-UacU/edit?usp=sharing)

Here is a graph of our results, with trend lines  
  
###### WAITING ON IMAGE UPLOAD!

Once again, all the raw data can be found in both our *raw_data* directory and our Google Sheet, which is linked above  


## Conclusions
Our raw data just in a table isn't that useful, as you can see a trend of time increasing as matrix size increases, but how it is increasing is what's important.
The graph shown above, though there are discrepencies, which are addressed below
