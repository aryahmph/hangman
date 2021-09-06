package aryahmph.entity;

import java.util.HashMap;

public class Game {
    private HashMap<String, String[]> categories;
    private String rules;

    public Game(String rules) {
        this.rules = rules;
    }

    public HashMap<String, String[]> getCategories() {
        this.categories = new HashMap<String, String[]>();
        this.categories.put("Animal", new String[]{"lion", "panda", "camel", "pig", "dog", "cat", "horse", "sheep", "fox", "cow"});
        this.categories.put("Fruit", new String[]{"apple", "banana", "orange", "mango", "grapes", "pineapple", "avocado", "lime"});
        return categories;
    }

    public String getRules() {
        this.rules = "You are given 10 chances to guess the complete word. If the chance to guess runs out, then you lose";
        return rules;
    }
}
