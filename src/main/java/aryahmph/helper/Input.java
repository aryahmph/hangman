package aryahmph.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    private final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    public String input(String text) throws IOException {
        System.out.print(text + " : ");
        return bufferedReader.readLine().trim();
    }
}
