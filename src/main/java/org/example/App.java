package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        DayOne dayOne = new DayOne();
        dayOne.solve();
        dayOne.solvePartTwo();
        DayTwo dayTwo = new DayTwo();
        dayTwo.solve();
        dayTwo.solvePartTwo();
        DayThree dayThree = new DayThree();
        dayThree.solve();
    }
}
