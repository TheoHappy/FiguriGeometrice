import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class MyCanvas extends JComponent {
    public void paint(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLUE);

        // Rectangle
        graphics.fillRect(20, 20, 200, 100);

        // Polygon with 17 sides "Heptadecagon"
        graphics.setColor(Color.YELLOW);
        int x[] = {380, 344, 313, 290, 280, 284, 300, 327, 362, 398, 433, 460, 476, 480, 470, 447, 416};
        int y[] = {20, 27, 46, 75, 111, 147, 180, 205, 218, 218, 205, 180, 147, 111, 75, 46, 27};
        int numberOfSides = 17;
        graphics.fillPolygon(x, y, numberOfSides);

        // Triangle
        graphics.setColor(Color.RED);
        graphics.fillPolygon(new int[]{600, 530, 670}, new int[]{30, 130, 130}, 3);

        //Line
        graphics.setColor(Color.BLUE);
        graphics.drawLine(20, 300, 220, 300);

        // Sector of ellipse
        Graphics2D g2 = (Graphics2D) graphics;

        g2.setStroke(new BasicStroke(2.0f));
        g2.setPaint(Color.YELLOW);
        g2.fill(new Arc2D.Double(160, 260, 300, 200, 0, 90, Arc2D.PIE));

        // Circle
        graphics.setColor(Color.RED);
        graphics.fillOval(490,260,200,200);

        // Parallelepiped
        graphics.setColor(Color.BLUE);
        graphics.fillPolygon(new int[]{80,240,200,40}, new int[]{460,460,560,560},4);
        graphics.drawPolygon(new int[]{120,280,240,80}, new int[]{410,410,460,460},4);
        graphics.drawPolygon(new int[]{120,250,200,80}, new int[]{510,510,560,560},4);
        graphics.drawLine(250,510,280,410);
        graphics.drawLine(120,410,120,510);

        // Sector of circle
        g2.setStroke(new BasicStroke(2.0f));
        g2.setPaint(Color.YELLOW);
        g2.fill(new Arc2D.Double(160, 460, 300, 300, 0, 90, Arc2D.PIE));

        // Ellipse

        graphics.setColor(Color.RED);
        graphics.fillOval(490,480,200,120);

    }

}
