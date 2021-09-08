package aryahmph.view;

import aryahmph.helper.Input;
import aryahmph.service.GameService;

import java.util.HashMap;

public class GameView {
    private final Input inputUtil = new Input();
    private GameService gameService;

    private int chances = 10;
    private String word;

    public GameView(GameService gameService) {
        this.gameService = gameService;
    }

    public void enterPlayerName() {
        System.out.println("-- HANGMAN\n");
        String name = inputUtil.input("Please enter your name");
        System.out.println("Welcome " + name + "!");
    }

    public void showRules() {
        System.out.println("\n== Rules");
        System.out.println(gameService.getRules());
    }

    public String chooseCategory() {
        HashMap<String, String[]> categories = this.gameService.getCategories();
        System.out.println("\n== Category List");
        int i = 1;
        for (String category : categories.keySet()) {
            System.out.println(i++ + ". " + category);
        }

        String category = inputUtil.input("\nChoose category (ex: animal)").toLowerCase();
        if (!categories.containsKey(category)) {
            throw new IllegalArgumentException();
        }
        word = this.gameService.generateRandomWordWithCategory(category);
        return category;
    }

    public void guess() {
        System.out.println(this.word);
        StringBuilder hangmanWord = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) hangmanWord.append("_");
        System.out.println(hangmanWord);

        String hangmanWordStr = hangmanWord.toString();

        while (chances > 0) {
            System.out.println("\n== Your chances : " + this.chances);
            char guessChar = inputUtil.input("Guess character").toLowerCase().charAt(0);
            String temp = this.gameService.completeWord(hangmanWordStr, guessChar, this.word);
            System.out.println(temp);
            hangmanWordStr = temp;

            if (hangmanWordStr.equals(this.word)) break;
            this.chances--;
        }

        System.out.println();
        if (chances == 0) System.out.println("LOSE");
        else System.out.println("WIN");
    }
}
