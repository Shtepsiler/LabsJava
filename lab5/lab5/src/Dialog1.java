import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class lab5 {
    public static void main(String[] args){
// фрагмент as is (1)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){}


        JFrame frm = new JFrame("DoubleVector calculator");
        frm.setSize(380, 300);
        Container c = frm.getContentPane();

        c.add(new JLabel("vector 1"));
        c.setLayout(new FlowLayout());
        DoubleVector DV1 = DoubleVector.TestVector(3);
        String string = DoubleVector.ToString(DV1);
        c.add(new JTextField(string));
        c.setLayout(new FlowLayout());
        c.add(new JLabel("vector 2"));
        c.setLayout(new FlowLayout());
        DoubleVector DV2 = DoubleVector.TestVector(3);
        String string1 = DoubleVector.ToString(DV2);
        c.add(new JTextField(string1));
        c.setLayout(new FlowLayout());
        c.add(new JLabel("vector sum"));
        c.setLayout(new FlowLayout());
        DoubleVector DVMULT = DoubleVector.sum(DV1,DV2);
        String string3 = DoubleVector.ToString(DVMULT);
        c.add(new JTextField(string3));
        c.setLayout(new FlowLayout());

        c.add(new JLabel("vector dif"));
        c.setLayout(new FlowLayout());
        DoubleVector DVDIFF = DoubleVector.diff(DV1,DV2);
        String string4 = DoubleVector.ToString(DVDIFF);
        c.add(new JTextField(string4));
        c.setLayout(new FlowLayout());

// фрагмент as is (2)

          WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        frm.addWindowListener(wndCloser);
        frm.setVisible(true);
    }
}
