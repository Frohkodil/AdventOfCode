package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayThree implements Day{
    @Override
    public void solve() throws IOException {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        File file = new File("src/main/resources/day3.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        int score = 0;
        for (String string: list) {
            String a = string.substring(0, string.length()/2);
            String b = string.substring(string.length()/2);
            Set<String> targetSet = new HashSet<>(List.of(a.split("")));
            for (String test: targetSet){
                if(b.contains(test)){
                    score += alphabet.indexOf(test) + 1;;
                }
            }
        }
        System.out.println(score);
    }

    @Override
    public void solvePartTwo() throws IOException {

    }
}
