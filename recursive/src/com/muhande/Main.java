package com.muhande;

public class Main {

    private static int depth= 0;

    public static void main(String[] args) {


       recurse(2, 10);


    }

    static void recurse(int m, int n){

        if ( m < 0 || n < m){
            //System.out.println("Either m is less than 0 or n is less than m \n Can't continue. \n proceeding to next step...");
            recurseback(m - depth, n);
            return;
        }

        for (int i = 1; i <= m; i++){
            System.out.print("*");
        }

        System.out.println();
        ++depth;

        recurse(m + 1, n);
    }

    static void recurseback(int m, int n){
        if ( n < m){
           System.out.println("End reached\nProgram Stopping...");
           return;
        }

        for (int i = n; i > 0; i--){
            System.out.print("*");
        }

        System.out.println();


        recurseback(m, n - 1);

    }
}
