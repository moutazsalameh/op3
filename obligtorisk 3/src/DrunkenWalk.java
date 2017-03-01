/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MouNj
 */
import java.util.Scanner;
//Now write a client program in a file named DrunkenWalk.java. The program should simulate a drunk staggering
//randomly on some sort of platform (imagine a square dock in the middle of a lake). The goal of the program is to
//have the program simulate the walk many times (because of randomness each walk is different) and count the
//number of times the drunk falls off the platform (goes out of bounds). Your program should read in the boundary,
//the maximum number of steps, and the number of drunks to simulate. It should then have a loop (a for loop would
//be a good idea) that on each iteration instantiates a new RandomWalk object to represent a drunk, has the object
//walk, then determines whether or not the drunk fell off the platform (and updates a counter if it did). After the loop
//print out the number of times the drunk fell off. Compile and run your program. To see the “randomness” you
//should run it several times. Try input of 10 for the boundary and 200 for the number of steps first (sometimes the
//drunk falls off, sometimes not); try 10 for the boundary and 500 for the steps (you should see different behavior); try
//50 for the boundary and 200 for the steps (again different behavior).

public class DrunkenWalk {

    public static void main(String[] args) {

        int countOutBounds = 0; //count number of times drunks goes out of bounds 
        RandomWalk drunk;
        int max;
        int edge;
        int drunks;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the boundary for the square: ");
        edge = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        max = scan.nextInt();
        System.out.println("Enter the amount of drunks to simulate");
        drunks = scan.nextInt();

        for (int i = 1; i <= drunks; i++) {
            drunk = new RandomWalk(max, edge);

            drunk.walk();
            if (drunk.inBounds() == false) {
                countOutBounds = countOutBounds + 1;
            }

        }
        System.out.println("number of times the drunk falls off the platform " + countOutBounds);

    }
}
