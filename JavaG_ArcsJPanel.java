
package javag_arcsjpanel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaG_ArcsJPanel extends JPanel
{
    // draw rectangles and arcs
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // call superclass's paintComponent

        // start at 0 and sweep 360 degrees
        g.setColor(Color.BLACK);
        g.drawRect(15, 35, 150, 150);
        g.setColor(Color.MAGENTA);
        g.drawArc(15, 35, 150, 150, 0, 360);
        
        //start at 0 and weep 110 degrees
        g.setColor(Color.BLACK);
        g.drawRect(190, 35, 150, 150);
        g.setColor(Color.MAGENTA);
        g.drawArc(190, 35, 150, 150, 0, 110);
        
        //start at 0 and sweep -270 degrees
        g.setColor(Color.BLACK);
        g.drawRect(370, 35, 150, 150);
        g.setColor(Color.MAGENTA);
        g.drawArc(370, 35, 150, 150, 0, -270);
        
        //start at 0 and sweep 360 degress
        g.setColor(Color.PINK);
        g.fillArc(50, 200, 80, 70, 0, 360);
        
        //start at 270 and sweep -90 degrees
        g.fillArc(220, 200, 80, 70, 270, -270);
        
        //start at 0 and sweep -270 degrees
        g.fillArc(400, 200, 80, 70, 0, -270);     
    }
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JavaG_ArcsJPanel arcsJPanel = new JavaG_ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    
}

