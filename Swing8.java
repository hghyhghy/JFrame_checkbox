
import javax.swing.*;

public class Swing8
{
       Swing8()
       {

              JFrame f= new JFrame();

              JCheckBox jc= new JCheckBox("C++");

              JCheckBox jc1= new JCheckBox("JAVA",true);

              jc.setBounds(100,100,50,50);

              jc1.setBounds(100,150,50,50);
              

              f.add(jc);

              f.add(jc1);

              f.setSize(400,400);

              f.setLayout(null);

              f.setVisible(true);

       }

        public static void main(String[] args) 
        
        {
              new Swing8();

        }
}
