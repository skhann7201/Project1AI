package org.example;

/**
 * This is how our ship (Leviathan) will be constructed
 * this class will be used by the other classes to navigate the ship
 */
public class Ship {
    final int D = 50;  //this is the size of our ship
    final int[][] shipMaze = new int[D][D];
    Direction move;

    public Ship(Direction d){
        this.move = d;
    }
    
}
