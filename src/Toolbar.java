import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
        JButton home = createButton("Home", "Home");
        toolbar.add(home);

        JButton contact = createButton("Contact", "Contact us");
        toolbar.add(contact);

        JButton about = createButton("About", "About this application");
        toolbar.add(about);

        JButton exit = createButton("Exit", "exit application");
        exit.addActionListener((ActionEvent ae)-> System.exit(0));
        toolbar.add(exit);

    }

    private static JButton createButton(String text, String toolTipText)
    {
        JButton home = new JButton(text);
        home.setToolTipText(toolTipText);
        home.setBackground(BUTTON_BACKGROUND_COLOR);
        home.setForeground(BUTTON_TEXT_COLOR);
        return home;
    }
}
