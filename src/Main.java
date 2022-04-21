import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double w, x, y, z;
        Scanner sc = new Scanner(System.in);
        Box box = null;
        while (true) {
            int k = 0;
            System.out.println("Enter the length of sides in counterclockwise (starting from the left vertical side):");
            w = sc.nextDouble();
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
            try {
                box = new Box(w, x, y, z);
            } catch (InvalidBoxException e) {
                switch (e.trigger_value) {
                    case 0:
                        System.out.println("One or more length(s) is/are <=0");
                        k = 1;
                        break;
                    case 1:
                        System.out.println("Corresponding Vertical as well as Horizontal lengths are Invalid ");
                        k = 1;
                        break;
                    case 2:
                        System.out.println("Vertical Lines are unequal");
                        k = 1;
                        break;
                    case 3:
                        System.out.println("Horizontal Lines are unequal");
                        k = 1;
                        break;
                }
            }finally {
                if(k == 1)
                    continue;
                else
                break;
            }
        }
        JFrame frame = new JFrame();
        frame.setSize(640,480);
        DrawingBoard painting = new DrawingBoard(box);
        frame.setTitle("Box");
        frame.add(painting);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
