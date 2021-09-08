package aryahmph;

import aryahmph.entity.Game;
import aryahmph.service.GameService;
import aryahmph.view.GameView;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        GameService gameService = new GameService(game);
        GameView gameView = new GameView(gameService);

        gameView.enterPlayerName();
        gameView.showRules();
        gameView.chooseCategory();
        gameView.guess();
    }
}
