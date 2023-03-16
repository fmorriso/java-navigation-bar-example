import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel
{
    public Toolbar(Dimension frameSize)
    {
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
        toolbar.add(home);

        JButton contact = new JButton("Contact");
        contact.setToolTipText("Contact Us");
        toolbar.add(contact);

        JButton about = new JButton("About");
        about.setToolTipText("About this application");
        toolbar.add(about);

    }
}
