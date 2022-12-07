package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DayTwo implements Day{

    @Override
    public void solve() throws IOException {
        File file = new File("src/main/resources/day2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        int score = 0;
        for (String string: list) {
            String opponent = string.substring(0,1);
            String player = string.substring(2);
            if(player.equals("X")){
                score += 1;
                if (opponent.equals("A")) {
                    score += 3;
                }
                else if (opponent.equals("B")) {
                    score += 0;
                }
                else {
                    score += 6;
                }
            } else if (player.equals("Y")) {
                score += 2;
                if (opponent.equals("A")) {
                    score += 6;
                }
                else if (opponent.equals("B")) {
                    score += 3;
                }
                else {
                    score += 0;
                }
            } else {
                score += 3;
                if (opponent.equals("A")) {
                    score += 0;
                }
                else if (opponent.equals("B")) {
                    score += 6;
                }
                else {
                    score += 3;
                }
            }
        }
        System.out.println(score);
    }

    @Override
    public void solvePartTwo() throws IOException {
        File file = new File("src/main/resources/day2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        int score = 0;
        for (String string: list) {
            String opponent = string.substring(0,1);
            String player = string.substring(2);
            if(player.equals("X")){
                score += 0;
                if (opponent.equals("A")) {
                    score += 3;
                }
                else if (opponent.equals("B")) {
                    score += 1;
                }
                else {
                    score += 2;
                }
            } else if (player.equals("Y")) {
                score += 3;
                if (opponent.equals("A")) {
                    score += 1;
                }
                else if (opponent.equals("B")) {
                    score += 2;
                }
                else {
                    score += 3;
                }
            } else {
                score += 6;
                if (opponent.equals("A")) {
                    score += 2;
                }
                else if (opponent.equals("B")) {
                    score += 3;
                }
                else {
                    score += 1;
                }
            }
        }
        System.out.println(score);
    }

}
