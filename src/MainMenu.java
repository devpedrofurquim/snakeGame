
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainMenu extends JPanel {
    public MainMenu(ActionListener startListener) {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Snake Game", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH); 
        
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(startListener);
        add(startButton, BorderLayout.CENTER);
    }
}
