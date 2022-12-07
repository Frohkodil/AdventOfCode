package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DayTwo implements Day{

    @Override
    public void solve() throws IOException {
        File file = new File("src/main/resources/day2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    }
}
