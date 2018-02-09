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
 
We start with a *500x500* matrix, and run a various number of trials of our algorithm, keeping track of how long it took to run and dividing that by 100 to get the average time.  

We then increment the size of the array by 500  
For example, the next run would be 10 trials of a 1000x1000 matrix, and then 10 trials of a 1500x1500 matrix...    

And so on and so forth until we reached a matrix of size 10000  
  
These were outputted to a .csv file, which were stored in the folder *raw_data*

Our *raw_data* folder also contains a folder called *old_data* that has data from an older method that was inefficent due to the test size being far too large  
In many of those cases, we were running up to 100 trials for each matrix size and only incrementing by 50 - most of the time our computers would take too long to actually print out to the very end.  

Though it is not used in our final results, it is important to look at the data and also understand why our testing method was inefficent.

## Results  
All of our results can be seen organized [here] (https://docs.google.com/spreadsheets/d/1XvStXDj2gqjJ0mAwMfi8f4sbaL79i_ZEd0IYBT-UacU/edit?usp=sharing)  
There are two spreadsheets - the one titled *new data* is what contains the results that are considered for the experiment.  

The other one, *old data*, has results from the previous method that was mentioned

Here is a graph of our results, with trend lines.
Note that each line represents the average of 10 trials for each matrix size.
![alt text](http://google.com)

  
###### WAITING ON IMAGE UPLOAD!

Once again, all the raw data can be found in both our *raw_data* directory and our Google Sheet, which is linked above  


## Conclusions
Our raw data just in a table isn't that useful, as you can see a trend of time increasing as matrix size increases, but how it is increasing is what's important.
The graph shown above, though there are discrepencies, which are addressed below
