import javax.swing.*;
import java.awt.*;

public class AboutPage extends JPanel
{
    private Dimension pageSize;
    private CONSTANTS consts;

    private static final String pageName = "AboutPage";

    public AboutPage(Dimension frameSize){
        int height = (int) (frameSize.height * 0.95);
        int width = frameSize.width;
        pageSize = new Dimension(width, height);
        setSize(pageSize);
        setPreferredSize(pageSize);
        consts = new CONSTANTS(pageSize);

        System.out.format("HomePage size (w: %d, h: %d): %n", pageSize.width, pageSize.height);
        // change background color to see if page is visible
        setBackground(Color.CYAN);

        JLabel top = createTopLabel();
        add(top);
    }

    public String getPageName(){ return pageName;}

    private JLabel createTopLabel()
    {
        JLabel lbl = new JLabel("About Page", SwingConstants.CENTER);
        lbl.setSize(consts.SIZE_H1());
        lbl.setFont(consts.FONT_H1());
        lbl.setBackground(consts.LABEL_COLOR_BACKGROUND());
        lbl.setOpaque(true);// ** REQUIRED to make setBackground work
        lbl.setForeground(consts.LABEL_COLOR_FOREGROUND());
        lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK, pageSize.height / 80, true));
        return lbl;
    }
}
