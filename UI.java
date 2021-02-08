import javax.swing.*;

//import jdk.internal.net.http.common.Pair;

import java.awt.*;
import java.util.ArrayList;

public class UI {

    public ArrayList<ArrayList<JPanel>> gridList=new ArrayList<ArrayList<JPanel>>();
    //public ArrayList<Pair <Integer,Integer> >  snake;
    public UI(int frameSize)
    {
        JFrame frame=new JFrame();
        ArrayList<JPanel> temp;
        for(int i=0;i<frameSize;i++)
        {
            temp=new ArrayList<JPanel>();
            for(int j=0;j<frameSize;j++)
            {
                panel p = new panel(Color.BLACK);
               frame.add(p.getPanel());
               temp.add(p.getPanel());
               
            }
            gridList.add(temp);
        }


        frame.setLayout(new GridLayout(frameSize,frameSize));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
       
    
    }
    
}
