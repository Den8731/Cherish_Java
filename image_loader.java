
import javax.swing.*;
import java.awt.*;

public class image_loader extends JFrame {
    public image_loader(){
    setTitle("Photo viewer");
    setSize(950,700);

    //Load photo
        ImageIcon imageIcon = new ImageIcon("path/to/your/photo.jpg");
        Image image = imageIcon.getImage();

    }

    JFrame
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new DisplayPhoto());
    }

}