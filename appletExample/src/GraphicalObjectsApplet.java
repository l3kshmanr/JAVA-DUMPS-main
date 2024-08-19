// import java.applet.Applet;
// import java.awt.*;
// import java.util.*;
// import java.awt.Font;
// import java.awt.Graphics;

// public class shape extends Applet {

//     public void init() {
//         // Draw an oval
//         setBackground(Color.BLUE);
//         setBackground(Color.red);
//     }

//     public  void paint(Graphics g) {
//         Font f = new Font("arial", Font.BOLD, 20);
//         g.setFont(f);
//         g.drawLine(40,30,200,30);
//     }
// }


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicalObjectsApplet extends Applet {

    public void paint(Graphics g) {
        // Draw an oval
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 100, 80);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(200, 50, 100, 80);

        // Draw a line
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 150, 200);

        // Draw an arc
        g.setColor(Color.ORANGE);
        g.fillArc(200, 200, 100, 80, 45, 270);
    }
}
