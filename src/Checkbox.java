import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JFrame implements ActionListener {

    JCheckBox checkBox;

    public Checkbox()
    {
        setTitle("Checkbox");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        checkBox = new JCheckBox("Check me");
        checkBox.setBounds(50, 50, 100, 30);
        add(checkBox);
        checkBox.addActionListener(this);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkBox){
            if(checkBox.isSelected()){
                JOptionPane.showMessageDialog(null, "It is Checked");
            }
            if(!checkBox.isSelected()){
                JOptionPane.showMessageDialog(null, "It is not Checked");
            }
        }
    }
    public static void main(String[] args){
        new Checkbox();
    }
}
