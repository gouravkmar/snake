import javax.swing.*;
import java.awt.*;
public class panel {

    public JPanel panel ;
    public panel(Color c)
    { 
        panel=new JPanel();
        panel.setBackground(c);
    }
    public JPanel getPanel()
    {
        return panel;
    }
    public void setPanelColor(Color c)
    {
        panel.setBackground(c);
        panel.repaint();
    }
}
