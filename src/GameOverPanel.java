import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GameOverPanel extends JPanel {
    public GameOverPanel(ActionListener restartListener) {
        setLayout(new BorderLayout());

        JLabel gameOverLabel = new JLabel("Game Over", SwingConstants.CENTER);
        gameOverLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(gameOverLabel, BorderLayout.NORTH);

        JButton restartButton = new JButton("New Game");
        restartButton.addActionListener(restartListener);
        add(restartButton, BorderLayout.CENTER);
    }
}
