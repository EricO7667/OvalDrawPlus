import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

// create the oval in the frame
class createOval extends JPanel {

    // creates color in rgb scheme
    private Color gold = new Color(218,165,32);
    private Color rectangleColor = new Color(0,0,255);

    // create oval and fill oval with color
    public void paintComponent(Graphics g) {

        // cast into Graphics2D
        Graphics2D graphs2 = (Graphics2D) g;

        // length of oval and height of oval
        int width = getWidth();
        int height = getHeight();

        // set blue rectangle behind oval
        // Set window to fullScreen to see the rectangle 
        graphs2.setColor(rectangleColor);
        graphs2.fillRect(75, 75, width-150, height-150);

        // set the oval's color
        graphs2.setColor(gold);
        graphs2.fillOval(0, 0, width, height);    
    }
}

// create the window frame
class windowCreateFrame extends JFrame {

    // create constuctor
    windowCreateFrame() {
        System.out.println("Starting OvalDrawPlus...");
        setBounds(250, 150, 400, 500);                      // set bounds for window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // exit closeing 

        // adds a window listener to print out a closing statment
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.out.println("closing OvalDrawPlus...");
                System.exit(0);
            }
        });

        // create a container for the createOval 
        Container bowl = getContentPane();

        // add createOval into the container
        createOval cO = new createOval();
        bowl.add(cO);     
    }
}

// this class will hold the main method and launch code
public class OvalDrawPlus {
    public static void main(String[] args) {
        windowCreateFrame wCF = new windowCreateFrame();
        wCF.setVisible(true);
    }
}