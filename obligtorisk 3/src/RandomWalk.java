
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MouNj
 */
public class RandomWalk {
//    The RandomWalk class will have the following instance data (all type int):
//• the x coordinate of the current position
//• the y coordinate of the current position
//• the maximum number of steps in the walk
//• the number of steps taken so far in the walk
//• the boundary of the square (a positive integer -- the x and y coordinates of the
//minus this value)
//Create a new file RandomWalk.RandomWalk. You’ll define the RandomWalk class incrementa
//1. First declare the instance data (as described above) and add the following two constructors and toString method.

   
    int maxNumberOfSteps; //the maximum number of steps in the walk
    int theMaximumXonSqurae;//the boundary of squrae represetive as(theMaximumX , theMaximumY can vary between plus and
    // minus this value)
    int theMaximumYonSqurae;
    int edge;//the boundary of squrae in positve value
    int edgeNegative; //the boundary of squrae in  negative value
    int numberofStebs; // the number of steps taken so far in the walk

    int theXcoordinateOfCurrentPosition;
    int theYcoordinateOfCurrentPosition;


// RandomWalk (int max, int edge) - Initializes the RandomWalk object. The maximum number of steps and
//the boundary are given by the parameters. The x and y coordinates and the number of steps taken should be
//set to 0.
    public RandomWalk(int maxNumberOfSteps, int edge) {
        this.maxNumberOfSteps = maxNumberOfSteps;
        this.theMaximumXonSqurae = edge;
        this.theMaximumYonSqurae = edge;
        this.theXcoordinateOfCurrentPosition = 0;
        this.theYcoordinateOfCurrentPosition = 0;
        this.numberofStebs = 0;
        this.edge = edge;
        this.edgeNegative = ((edge) * (-1));

    }

// RandomWalk (int max, int edge, int startX, int startY) -- Initializes the maximum number of steps, the
//boundary, and the starting position to those given by the parameters.
    public RandomWalk(int maxNumberOfSteps, int edge, int startX, int startY) {
        this.maxNumberOfSteps = maxNumberOfSteps;
        this.theMaximumXonSqurae = edge;
        this.theMaximumYonSqurae = edge;
        this.edge = edge;
        this.theXcoordinateOfCurrentPosition = startX;
        this.theYcoordinateOfCurrentPosition = startY;
    }

    public int getTheXCoordinateOfCurrentPosition() {
        return theXcoordinateOfCurrentPosition;
    }

    public void setTheXCoordinateOfCurrentPosition(int theXCoordinateOfCurrentPosition) {
        this.theXcoordinateOfCurrentPosition = theXCoordinateOfCurrentPosition;
    }

    public int getTheYCoordinateOfCurrentPosition() {
        return theYcoordinateOfCurrentPosition;
    }

    public void setTheYCoordinateOfCurrentPosition(int theYCoordinateOfCurrentPosition) {
        this.theYcoordinateOfCurrentPosition = theYCoordinateOfCurrentPosition;
    }



    public void takestep() {

        numberofStebs = numberofStebs + 1;

        Random rn = new Random();
        int step = rn.nextInt(4);

        switch (step) {
            case 0:

                this.theYcoordinateOfCurrentPosition = theYcoordinateOfCurrentPosition + 1; //0= will represent going up y+1 , x+0 

                break;
            case 1:

                this.theYcoordinateOfCurrentPosition = theYcoordinateOfCurrentPosition - 1; //1= will represent going down y-1 , x+0 

                break;
            case 2:

                this.theXcoordinateOfCurrentPosition = theXcoordinateOfCurrentPosition + 1; //2= will represent going right y+0 , x+1 

                break;

            case 3:

                this.theXcoordinateOfCurrentPosition = theXcoordinateOfCurrentPosition - 1; //3= will represent going up y+0 , x-1 

                break;
        }
    }
//
////  step  5.  Now add to RandomWalk.java the following two methods. Each should be a single return statement that returns the
////value of a boolean expression.
//// boolean moreSteps() - returns true if the number of steps taken is less than the maximum number; returns
////false otherwise
//

    public boolean moreSteps() {

        if (this.numberofStebs < this.maxNumberOfSteps) {

            return true;
        } else {

            return false;
        }
    }
//
//    // boolean inBounds() - returns true if the current position is on the square (include the boundary as part of the
////square); returns false otherwise.

    public boolean inBounds() {

        if (((this.theMaximumXonSqurae) < (this.edge)) && ((this.theMaximumYonSqurae) < (this.edge))) {
            return true;
        } else {
            return false;
        }
    }

//    public int getCountOutBounds() {
//        return countOutBounds;
//    }
    
//// 6 steps * Add to the RandomWalk class a method named walk that has no parameters and returns nothing. Its job is to
////simulate a complete random walk. That is, it should generate a sequence of steps as long the maximum number of
////steps has not been taken and it is still in bounds (inside the square). This should be a very simple loop (while or do...
////while) --- you will need to call the methods takeStep, moreSteps, and inBounds.
//

    public void walk() {
        while ((numberofStebs < maxNumberOfSteps) && ((this.theXcoordinateOfCurrentPosition) < (this.edge)) && ((this.theYcoordinateOfCurrentPosition) < (this.edge)) && ((this.theXcoordinateOfCurrentPosition) > (this.edgeNegative)) && ((this.theYcoordinateOfCurrentPosition) > (this.edgeNegative))) { //while max number of steps is not taken and walk is still in bounds 
            takestep();
            moreSteps();
            inBounds();
        }

    }

    @Override
    // String toString() - returns a String containing the number of steps taken so far and the current position --
//The string should look something like: Steps: 12; Position: (-3,5)
    public String toString() {
        return "Steps : " + this.numberofStebs + "\n"
                + "Position : (" + theXcoordinateOfCurrentPosition + "," + theYcoordinateOfCurrentPosition + ")" + "\n  the boundary :" + this.edge + "\n maximum number of"
                + " steps :" + this.maxNumberOfSteps;
    }

}
