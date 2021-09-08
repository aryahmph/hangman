package aryahmph.service;

import aryahmph.entity.Game;

import java.util.HashMap;

public class GameService {
    private Game game;

    private final StringBuilder builder = new StringBuilder();

    public GameService(Game game) {
        this.game = game;
    }

    public HashMap<String, String[]> getCategories() {
        return game.getCategories();
    }

    public String getRules() {
        return game.getRules();
    }

    public String generateRandomWordWithCategory(String category) {
        String[] values = game.getCategories().get(category);
        int rand = (int) (Math.random() * values.length);
        return values[rand];
    }

    public String completeWord(String guessStr, char guessChar, String word) {
        builder.setLength(0);
        for (int i = 0; i < word.length(); i++) {
            if (guessStr.charAt(i) != '_') {
                builder.append(guessStr.charAt(i));
            } else if (guessChar == word.charAt(i)) {
                builder.append(guessChar);
            } else {
                builder.append("_");
            }
        }
        return builder.toString();
    }
}
