import javax.swing.*;
import java.awt.*;

public class Driver
{
    public static void main(String[] args)
    {
        Dimension scaledSize = getScaledSize(0.85, 10);
        System.out.println(scaledSize);

        JFrame frame = new JFrame("Java Top Navigation Bar Example");
        frame.setSize(scaledSize);
        frame.setPreferredSize(scaledSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
        //BoxLayout layout = new BoxLayout(frame, BoxLayout.Y_AXIS);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        Toolbar toolbar = new Toolbar(scaledSize);
        frame.add(toolbar);

        // define the various pages and keep hidden until activated by the corresponding
        // navigation toolbar button.
        //TODO: create pages and add to JFrame
        HomePage homePage = new HomePage(scaledSize);
        frame.add(homePage);

        frame.pack();
        // puts the JFrame in the middle of the physical screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Gets a rectangle that is scaled to a percentage of available device screen size,
     * rounded up to the specified multiple.
     *
     * @param pct - the percentage (> 0 and < 1.0) of available device screen size to use.
     * @param multipleOf - value to round up the scaled size to be a multiple of.
     * @return - a Dimension object that holds the scaled width and height.
     */
    private static Dimension getScaledSize(double pct, int multipleOf)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize);
        if (pct < 0.1 || pct > 1)
            return screenSize;
        System.out.format("Screen width=%d, height=%d%n", screenSize.width, screenSize.height);
        final int frameHeight = (int) (screenSize.height * pct) / multipleOf * multipleOf;
        final int frameWidth = (int) (screenSize.width * pct) / multipleOf * multipleOf;
        Dimension frameSize = new Dimension(frameWidth, frameHeight);
        System.out.format("scaled frame: width=%d, height=%d%n", frameWidth, frameHeight);
        return frameSize;
    }
}