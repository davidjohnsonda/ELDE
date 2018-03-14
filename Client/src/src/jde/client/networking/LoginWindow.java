package src.jde.client.networking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginWindow extends JDialog{
    private JTextField serverAddressField;
    private JTextField usernameField;

    public LoginWindow(){
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5); //propert(ies)y here for all controls

        JLabel serverAddressLabel = new JLabel("La direción del server:");
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        add(serverAddressLabel, c);

        serverAddressField = new JTextField();
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(serverAddressField, c);

        JLabel usernameLabel = new JLabel("Nombre: ");
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        add(usernameLabel, c);

        usernameField = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(usernameField, c);

        JButton login = new JButton("Entrar");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        login.addActionListener(this::onLogin);
        add(login, c);

        setModal(true);
        setTitle("Entrar en server");
        setResizable(false);
        pack();
        setSize(500, getHeight());
        setLocationRelativeTo(null);
    }

    private void onLogin(ActionEvent e){
        setVisible(false);
    }

    public String getServerAddress(){
        return serverAddressField.getText();
    }

    public String getUsername(){
        return usernameField.getText();
    }

}
