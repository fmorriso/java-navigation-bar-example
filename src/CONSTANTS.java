import java.awt.*;

public class CONSTANTS
{
    private Dimension _SIZE_H1 = null;
    private Font _FONT_H1 = null;
    private Color _LABEL_COLOR_BACKGROUND = new Color(51, 255, 51);
    private Color _LABEL_COLOR_FOREGROUND = Color.WHITE;

    public CONSTANTS(Dimension pageSize)
    {
        _SIZE_H1 = new Dimension(pageSize.width / 20, pageSize.height / 10);
        _FONT_H1 = new Font(Font.SANS_SERIF, Font.BOLD, pageSize.height / 8);
    }



    public  Dimension SIZE_H1() {return _SIZE_H1;}

    public  Font FONT_H1() {return _FONT_H1;}

    public  Color LABEL_COLOR_BACKGROUND() {return _LABEL_COLOR_BACKGROUND; }

    public Color LABEL_COLOR_FOREGROUND() {return _LABEL_COLOR_FOREGROUND; }
}
