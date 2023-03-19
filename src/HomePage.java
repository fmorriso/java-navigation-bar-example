import javax.swing.*;
import java.awt.*;

public class HomePage extends JPanel
{
    private Dimension pageSize;
    public HomePage(Dimension frameSize)
    {
        int height = (int) (frameSize.height * 0.95);
        int width = frameSize.width;
        pageSize = new Dimension(width, height);
        setSize(pageSize);
        setPreferredSize(pageSize);

        System.out.println(pageSize);
        // change background color to see if page is visible
        setBackground(Color.CYAN);

    }
}
