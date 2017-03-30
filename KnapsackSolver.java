import java.util.*;
import java.lang.*;
import java.io.*;

class KnapsackSolver {

    public static int knapsack(int W, int wt[], int vals[], int n){
        int myTable[n][W]  //creates a 2D array

        for(int i=0; i<n; i++ ){
            for(int j=0; j<=W; j++ ){
                if(W==0 | i==0){  //either the sack is empty or there is no item to take
                    myTable[i][j] = 0;
                else{
                    int option1 = vals[i]+myTable[i-1][j-wt[i];
                    int option 2 = myTable[i-1][j];
                    if(wt[i]<=j){
                        myTable[i][j]= max(option1, option2);
                    }else{
                        myTable[i][j]= option2;
                    }

                    }

                }

                }
                return myTable[n][W];
                }
            }




	public static void main (String[] args) {
		//testing the meothod above
	}
}
