package aryahmph.entity;

import java.util.HashMap;

public class Game {
    private HashMap<String, String[]> categories;
    private String rules;

    public HashMap<String, String[]> getCategories() {
        this.categories = new HashMap<>();
        this.categories.put("animal", new String[]{"lion", "panda", "camel", "pig", "dog", "cat", "horse", "sheep", "fox", "cow"});
        this.categories.put("fruit", new String[]{"apple", "banana", "orange", "mango", "grapes", "pineapple", "avocado", "lime"});
        this.categories.put("color", new String[]{"white", "blue", "red", "brown", "black", "yellow", "pink", "green"});
        return categories;
    }

    public String getRules() {
        this.rules = "You are given 10 chances to guess the complete word. If the chance to guess runs out, then you lose";
        return rules;
    }
}
