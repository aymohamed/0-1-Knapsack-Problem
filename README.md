# 0-1-Knapsack-Problem
Shown in the code snippets are my approach to solve the classical knapsack problem. It is also known as rucksack problem, 
0-1 knapsack problem among other names. The problem goes as follows:
Assume you are given weights and values of N items.Put these items in a knapsack of capacity W to get the maximum 
total value in the knapsack. Note that we have only one quantity of each item.Simply it means, given two integer 
arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given 
an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights 
of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it 
hence it is referred to as 0-1 Knapsack problem to distinguish it from other forms of the problem such as Fractional knapsack etc.


In order to solve this problem , I use dynamic programming using 2-Dimensional array. The time taken to solve this
problem is O(W*n). 

 
