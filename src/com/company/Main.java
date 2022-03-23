package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{9,66,55,44,33},{11,4,5,33,99}};
      int max = giatri_max_trongtunghang(arr);
        System.out.println(max);
    }
	// write your code here
        static int giatri_max_trongtunghang(int a[][])
        {
            int i,j;
            int max=a[0][0];
            for(i=0; i<a.length; i++)
                for(j=0; j<a[i].length; j++)
                    if(a[i][j]>max)
                    {
                        max=a[i][j];
                    }
            return max;
        }

}
