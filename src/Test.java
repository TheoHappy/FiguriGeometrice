import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        MyCanvas myCanvas = new MyCanvas();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(myCanvas);
        application.setSize(720,720);
        application.setBackground(Color.WHITE);
        application.setVisible(true);
    }
}
