import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel userlbl, passwordlbl;
    JTextField usertxt;
    JPasswordField userpsd;
    JButton login;
    public Login()
    {

        setTitle("Login Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        userlbl = new JLabel("Username");
        userlbl.setBounds(20, 20, 80, 25);
        add(userlbl);

        usertxt =  new JTextField();
        usertxt.setBounds(100, 20, 160, 25);
        add(usertxt);

        passwordlbl = new JLabel("Password");
        passwordlbl.setBounds(20, 50, 80, 25);
        add(passwordlbl);

        userpsd = new JPasswordField();
        userpsd.setBounds(100, 50, 160, 25);
        add(userpsd);

        login = new JButton("Login");
        login.setBounds(100, 90, 80, 25);
        login.addActionListener(this);
        add(login);

        setVisible(true);
        setLocation(350, 200);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login) {
            String username = usertxt.getText();
            String password = new String(userpsd.getPassword());

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    }
    public  static void main(String[] args){
        new Login();
    }
}
