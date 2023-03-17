import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel
{
    private static final Color BUTTON_BACKGROUND_COLOR = Color.BLUE.brighter().brighter();
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE;
    public Toolbar(Dimension frameSize)
    {
        super(new BorderLayout());

        int height = (int) ( frameSize.height / 20.0 );
        Dimension toolbarSize = new Dimension(frameSize.width, height);

        JToolBar toolbar = new JToolBar("Navigation");
        addButtons(toolbar);

        setPreferredSize(toolbarSize);
        add(toolbar, BorderLayout.PAGE_START);
    }

    private void addButtons(JToolBar toolbar)
    {
        JButton home = new JButton("Home");
        home.setToolTipText("Home");
        home.setBackground(BUTTON_BACKGROUND_COLOR);
        home.setForeground(BUTTON_TEXT_COLOR);
        toolbar.add(home);

        JButton contact = new JButton("Contact");
        contact.setToolTipText("Contact Us");
        toolbar.add(contact);

        JButton about = new JButton("About");
        about.setToolTipText("About this application");
        toolbar.add(about);

    }
}
