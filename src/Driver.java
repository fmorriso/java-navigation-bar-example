import javax.swing.*;
import java.awt.*;

public class Driver
{
    public static void main(String[] args)
    {
        final int multipleOf = 10;
        Dimension scaledSize = getScaledSize(0.67, multipleOf);
        System.out.format("Main page size (w: %d, h: %d): %n",scaledSize.width, scaledSize.height);

        Controller mvc = new Controller();

        JFrame frame = new JFrame("Java Top Navigation Bar Example");
        frame.setSize(scaledSize);
        frame.setPreferredSize(scaledSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // use a layout that stacks everything vertically
        // https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html        
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        double toolbarHeightPct = 0.04;
        int toolbarHeight = (int) ( scaledSize.getHeight() * toolbarHeightPct) / multipleOf * multipleOf;
        Dimension toolbarSize = new Dimension(scaledSize.width, toolbarHeight);

        // use toolbar height to see how much is left for use by panel pages
        double panelHeightPct = (1 - (toolbarSize.getHeight()/scaledSize.getHeight()));

        Toolbar toolbar = new Toolbar(scaledSize, mvc, toolbarHeightPct);
        frame.add(toolbar);

        // define the various pages and keep hidden until activated by the corresponding
        // navigation toolbar button.
        HomePage homePage = new HomePage(scaledSize, panelHeightPct);
        frame.add(homePage);
        mvc.addPanel(homePage);

        AboutPage aboutPage = new AboutPage(scaledSize, panelHeightPct);
        frame.add(aboutPage);
        mvc.addPanel(aboutPage);

        ContactPage contactPage = new ContactPage(scaledSize,panelHeightPct);
        frame.add(contactPage);
        mvc.addPanel(contactPage);

        mvc.showPage(homePage.getPageName());

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