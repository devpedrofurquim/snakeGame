import java.awt.CardLayout;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight, () -> {
            cardLayout.show(container, "GameOver");
        });
        
        MainMenu mainMenu = new MainMenu(e -> {
            // Switch to game when start button is clicked
            cardLayout.show(container, "Game");
            snakeGame.requestFocus(); // Make sure SnakeGame has keyboard focus
        });

        GameOverPanel gameOverPanel = new GameOverPanel(e -> {
            cardLayout.show(container, "Game");  // Go to game screen
            snakeGame.startNewGame();            // Reset game state
            snakeGame.requestFocus();
        });


        // Add panels to CardLayout
        container.add(mainMenu, "Menu");
        container.add(snakeGame, "Game");
        container.add(gameOverPanel, "GameOver");

        frame.add(container);
        frame.setVisible(true);
        frame.pack();
        snakeGame.requestFocus();

         // Show the menu first
         cardLayout.show(container, "Menu");
    }
}
