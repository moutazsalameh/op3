/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MouNj
 */
public class Collisions {

    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        return (p1.getTheXCoordinateOfCurrentPosition() == p2.getTheXCoordinateOfCurrentPosition()) && (p1.getTheYCoordinateOfCurrentPosition() == p2.getTheYCoordinateOfCurrentPosition());
    }

    public static void main(String[] args) {
        int CollisionsCount = 0;
        int stepsCount = 0;
        int max = 200000;
        int edge = 200;
        RandomWalk p1 = new RandomWalk(max, edge, -3, 0);
        RandomWalk p2 = new RandomWalk(max, edge, 0, 3);

        for (int x = 0; x <= max; x++) {
            p1.takestep();
            p2.takestep();
            stepsCount = stepsCount + 1;
            System.out.println("the particles position  " + samePosition(p1, p2));

            System.out.println("The particles have collided: "
                    + CollisionsCount );
            if (samePosition(p1, p2) == true) {

                CollisionsCount = CollisionsCount + 1;
            }

            System.out.println("in the step " + stepsCount
                    + " the p1 AND P2 is collided : " + CollisionsCount);

        }

    }

}
