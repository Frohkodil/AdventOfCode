package org.example;

import java.io.*;
import java.util.ArrayList;

public class DayOne implements Day {

    public void solve() throws IOException {
        System.out.println("fehlt");
    }

    @Override
    public void solvePartTwo() throws IOException {
        File file = new File("src/main/resources/day1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        int highestCalories = 0;
        int secondCalories = 0;
        int thirdCalories = 0;
        int currentCalories = 0;
        for (String string: list) {
            if(!string.equals("")){
                currentCalories += Integer.parseInt(string);
            } else {
                if(currentCalories >= highestCalories){
                    thirdCalories = secondCalories;
                    secondCalories = highestCalories;
                    highestCalories = currentCalories;
                } else if (currentCalories >= secondCalories) {
                    thirdCalories = secondCalories;
                    secondCalories = currentCalories;
                } else if (currentCalories >= thirdCalories) {
                    thirdCalories = currentCalories;
                }
                currentCalories = 0;
            }
        }
        System.out.println(highestCalories + secondCalories +thirdCalories);
    }
}
