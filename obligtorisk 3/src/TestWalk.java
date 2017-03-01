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

public class TestWalk {

//2. Compile what you have so far then open the file TestWalk.java. This file will be used to test your RandomWalk
//methods. So far it prompts the user to enter a boundary, a maximum number of steps, and the x and y coordinates of
//a position. Add the following:
// Declare and instantiate two RandomWalk objects -- one with boundary 5, maximum steps 10, and centered
//at the origin (use the two parameter constructor) and the other with the values entered by the user.
// Print out each object. Note that you won’t get any information about the boundary or maximum number of
//steps (think about what your toString method does), but that’s ok.
//    
//  step4. Add a for loop to TestWalk.java to have each of your RandomWalk objects take 5 steps. Print out each object after
//each step so you can see what is going on. Compile and run the program to make sure it is correct so far.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk
// Declare and instantiate two RandomWalk objects -- one with boundary 5, maximum steps 10, and centered
//at the origin (use the two parameter constructor) and the other with the values entered by the user.

//        RandomWalk ob1 = new RandomWalk(10, 5);
        RandomWalk ob3 = new RandomWalk(200, 10);
//        System.out.println("Random Walk Test Program \n");
//
//        System.out.print("Enter the boundary for the square: "); // the boundary for the square: =edge in the class 
//        maxCoord = scan.nextInt();
//        System.out.print("Enter the maximum number of steps: ");
//        maxSteps = scan.nextInt();
//        System.out.print("Enter the starting x and y coordinates with "
//                + "a space between: \n");
////        ob3.walk();
////        System.out.println(ob3.toString());
//
//        System.out.print("x :");
//        x = scan.nextInt();
//        System.out.print("y :");
//        y = scan.nextInt();
//
//        RandomWalk ob2 = new RandomWalk(maxSteps, maxCoord, x, y);
//
//        System.out.print("Enter the starting x and y coordinates with "
//                + "a space between: 'for the second objekt' \n");
//        System.out.print("x :");
//        x = scan.nextInt();
//        System.out.print("y :");
//        y = scan.nextInt();
//        ob1.setTheXCoordinateOfCurrentPosition(x);
//        ob1.setTheYCoordinateOfCurrentPosition(y);
//        for (int i = 10; i >= 1; i--) {
//            ob1.takestep();
//            ob2.takestep();
//        }
//        System.out.println("obj1 \n" + ob1.toString());
//        System.out.println("obj2 \n" + ob2.toString());
//        ob3.walk();
//        System.out.println("obj3 \n" + ob3.toString());

//        DrunkenWalk dr = new DrunkenWalk(500, 10);
//        dr.walk();
//    
//        System.out.println(" the number of times the drunk fell off " + dr.getCountOutBounds());
    }
}
