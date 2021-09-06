package aryahmph.entity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class GameTest {
    @Test
    void TestGame() {
        Game game = new Game();
        System.out.println(game.getRules());
        HashMap<String, String[]> categories = game.getCategories();
        for (String category : categories.keySet()) {
            System.out.println(category + " : ");
            System.out.println(Arrays.toString(categories.get(category)));
        }
    }
}
