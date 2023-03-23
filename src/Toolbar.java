import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel
{
    private static final Color BUTTON_BACKGROUND_COLOR = Color.BLUE.brighter().brighter();
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE;

    private static final String pageName = "Toolbar";

    private Controller mvc;
    public Toolbar(Dimension frameSize, Controller controller)
    {
        super(new BorderLayout());

        mvc = controller;

        int height = (int) ( frameSize.height * 0.05 );
        Dimension toolbarSize = new Dimension(frameSize.width, height);

        JToolBar toolbar = new JToolBar("Navigation");
        addButtons(toolbar);

        setSize(toolbarSize);
        setPreferredSize(toolbarSize);
        add(toolbar, BorderLayout.PAGE_START);
    }

    public String getPageName(){ return pageName;}

    private void addButtons(JToolBar toolbar)
    {
        JButton home = createButton("Home", "Home");
        home.addActionListener( (ActionEvent ae) -> mvc.showPage("HomePage"));
        toolbar.add(home);

        JButton contact = createButton("Contact", "Contact us");
        contact.addActionListener( (ActionEvent ae) -> mvc.showPage("ContactPage"));
        toolbar.add(contact);

        JButton about = createButton("About", "About this application");
        about.addActionListener( (ActionEvent ae) -> mvc.showPage("AboutPage"));
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
