package aryahmph;

import aryahmph.entity.Game;
import aryahmph.service.GameService;
import aryahmph.view.GameView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        GameService gameService = new GameService(game);
        GameView gameView = new GameView(gameService);

        try (
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            gameView.enterPlayerName();
            boolean isRepeat = true;
            while (isRepeat) {
                gameView.showRules();
                gameView.chooseCategory();
                gameView.guess();

                System.out.println("\nPlay again ? (y/n)");
                char repeatChar = bufferedReader.readLine().charAt(0);
                if (repeatChar == 'n' || repeatChar == 'N') isRepeat = false;

            }
            System.out.println("Thank you for playing! See you again~");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
