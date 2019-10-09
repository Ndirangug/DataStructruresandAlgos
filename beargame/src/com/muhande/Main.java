package com.muhande;

import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        play_game(435);
    }

    static void play_game(int bears){
        // bears to be given out in this round
        int give = 0;

        // goal reached..end game
        if(bears == 42){
            System.out.println("##########\nCongrats!! You Win\n##########");
            return;

        // surpassed mnimum number of bears..failed
        } else if (bears < 42){
            System.out.println("**********\nYou Lose. You have only " + bears + " left\n**********");
            return;

        } else{
            //continue playing game
            /*
            0 -> Even
            1-> by3
            2-> by4
            3-> by5
             */
            boolean[] divisibilty = {false, false, false, false};
            if ( bears % 2 == 0){
                divisibilty[0] = true;

            }
            if (bears % 3 == 0){
                divisibilty[1] = true;
            }
            if (bears % 4 == 0){
                divisibilty[2] = true;
            }
            if (bears % 5 == 0.0){
                divisibilty[3] = true;
            }

            System.out.println("Choose among the following options to proceed with the game(0, 1, 2 or 3:" +
                    "\n0.For even numbers, give back half of your bears" +
                    "\n1.For divisible by 3, give back the product of last two digits" +
                    "\n2.For divisible by 4, give back the product of last two digits" +
                    "\n3.For divisible by 5, give back exactly 42 bears");
            System.out.println("The following options are available in this round:");
            for (int i = 0; i < divisibilty.length; i++) {
                    if (divisibilty[i] == true){
                        System.out.println(i + ",  ");
                    }
            }

            System.out.println();
            int choice = keyboard.nextInt();

            if (choice == 0){
                give = bears / 2;

            }else if(choice == 1 || choice == 2){
                give = (bears%10) * ((bears % 100) / 10);
            }
            else if (choice == 3){
                give = 42;
            }else{
                System.out.println("Invalid choice");//intoduce a jump

            }

            bears -= give;
            System.out.println("You have given " + give + " and now have " + bears + " left");
            play_game(bears);

        }


    }
}
