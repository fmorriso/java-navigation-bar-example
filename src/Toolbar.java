import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel
{
    private static final Color BUTTON_BACKGROUND_COLOR = Color.BLUE.brighter().brighter();
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE;
    public Toolbar(Dimension frameSize)
    {
        super(new BorderLayout());

        int height = (int) ( frameSize.height * 0.05 );
        Dimension toolbarSize = new Dimension(frameSize.width, height);

        JToolBar toolbar = new JToolBar("Navigation");
        addButtons(toolbar);

        setSize(toolbarSize);
        setPreferredSize(toolbarSize);
        add(toolbar, BorderLayout.PAGE_START);
    }

    private void addButtons(JToolBar toolbar)
    {
        JButton home = createButton("Home", "Home");
        //TODO: home.addActionListener((ActionEvent ae) -> System.exit(0));
        toolbar.add(home);

        JButton contact = createButton("Contact", "Contact us");
        toolbar.add(contact);

        JButton about = createButton("About", "About this application");
        toolbar.add(about);

        // the exit button will close down the application
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
