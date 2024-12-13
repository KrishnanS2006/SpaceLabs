
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

/**
* Creates a JPanel which contains the visual simulation
* @author Krishnan Sankar, Mohib Ahmed, Kanjonavo Sabud
* @version 1
*/
public class Game extends JPanel {

    /**
    * Constructer for Game. 
    * Used by Main Class in its JFrame
    **/
   public Game() {
      setLayout(new BorderLayout());
   
      JLabel label1 = new JLabel("Space Labs!");
      label1.setFont(new Font("Serif", Font.BOLD, 20));
      label1.setForeground(Color.BLACK);
      add(label1, BorderLayout.NORTH);
      
      RepaintApplet app = new RepaintApplet();
      app.setBackground(Color.BLACK);
      add(app, BorderLayout.CENTER);
      app.start();
   }

}