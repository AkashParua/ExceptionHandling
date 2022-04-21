import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
//this is the drawing element
public class DrawingBoard extends JComponent {
    Box box;
    DrawingBoard(Box box)
    {
      this.box = box;
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50,75,box.a,box.b);
        g2D.setColor(new Color(100,125,150));
        g2D.fill(r);
    }
}
