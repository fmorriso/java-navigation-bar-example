import javax.swing.*;
import java.awt.*;

public class HomePage extends JPanel
{
    private Dimension pageSize;
    private final Dimension SIZE_H1;
    private final Font FONT_H1;
    private final Color LABEL_COLOR_BACKGROUND = new Color(51, 255, 51);
    
    public HomePage(Dimension frameSize)
    {
        int height = (int) (frameSize.height * 0.95);
        int width = frameSize.width;
        pageSize = new Dimension(width, height);
        setSize(pageSize);
        setPreferredSize(pageSize);

        SIZE_H1 = new Dimension(pageSize.width / 20, pageSize.height / 10);
        FONT_H1 = new Font(Font.SANS_SERIF, Font.BOLD, pageSize.height / 8);

        System.out.format("HomePage size (w: %d, h: %d): %n",pageSize.width, pageSize.height);
        // change background color to see if page is visible
        setBackground(Color.CYAN);

        JLabel top = new JLabel("Home Page", SwingConstants.CENTER);
        top.setSize(SIZE_H1);
        top.setFont(FONT_H1);
        top.setBackground(LABEL_COLOR_BACKGROUND);
        top.setOpaque(true);// ** REQUIRED to make setBackground work
        top.setForeground(Color.WHITE);
        top.setBorder(BorderFactory.createLineBorder(Color.BLACK, pageSize.height/80, true) );
        add(top);

    }
}
