import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

class java_button{

    JFrame frame = new JFrame("Setting up a button");
    JPanel panel = new JPane("");
    Button button = new Button("Submit");

        button.addActionListener(e -> {
        // Action to perform when the button is clicked
        System.out.println("Button Clicked!");
    });

    panel.add(button);
    frame.add(panel);

}