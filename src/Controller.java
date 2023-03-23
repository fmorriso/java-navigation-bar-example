import javax.swing.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.AbstractMap;

public class Controller
{
    private ArrayList<AbstractMap.SimpleImmutableEntry> pages = new ArrayList<AbstractMap.SimpleImmutableEntry>();

    public void addPanel(JPanel panel)
    {
        //panels.add(panel);
        String key = panel.getClass().getSimpleName();
        AbstractMap.SimpleImmutableEntry kvp = new AbstractMap.SimpleImmutableEntry<>(key, panel);
        pages.add(kvp);
    }

    public void showPage(String pageName){
        for (AbstractMap.SimpleImmutableEntry page : pages) {
            String key = (String) page.getKey();
            // System.out.format("Key = %s%n", key);
            JPanel panel = (JPanel) page.getValue();
            if(key.equals(pageName)){
                panel.setVisible(true);
            } else {
                panel.setVisible(false);
            }
        }



    }


}
