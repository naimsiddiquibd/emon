import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class diu {
    private JRadioButton mb10;
    private JRadioButton mb20;
    private JRadioButton mb25;
    private JButton button1;
    private JTextField totalCost;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("diu");
        frame.setContentPane(new diu().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public diu() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int m1, m2, m3, tot;
                double total;

                m1 = Integer.parseInt(mb10.getText());
                m2 = Integer.parseInt(mb20.getText());
                m3 = Integer.parseInt(mb25.getText());
                totallll = m1 + m2;
                totalCost.setText(String.valueOf(m1));
            }
        });
    }
}
