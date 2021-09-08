package aryahmph.helper;

import aryahmph.service.GameService;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String input(String text) {
        System.out.print(text + " : ");
        return scanner.nextLine().trim();
    }
}
