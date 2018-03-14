package src.jde.client.networking;

import com.jme3.app.Application;
import com.jme3.network.Client;
import com.jme3.network.Network;

import src.jde.client.JdeClient;
import src.jde.common.JdeAppState;
import src.jde.common.networking.NetworkingUtilities;

import javax.swing.*;
import java.io.IOException;

public class NetworkAppState extends JdeAppState<JdeClient>{
    private Client networkClient;

    @Override
    protected void initialize(Application application) {
        LoginWindow loginWindow = new LoginWindow();

        while(true){
            try{
                loginWindow.setVisible(true);
                networkClient = Network.connectToServer(
                        NetworkingUtilities.PROTOCOL_NAME, NetworkingUtilities.PROTOCOL_VERSION,
                        loginWindow.getServerAddress(), NetworkingUtilities.PORT
                );
                networkClient.start();
                break;
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }

    @Override
    protected void cleanup(Application application) {

    }

    @Override
    protected void onEnable() {

    }

    @Override
    protected void onDisable() {

    }
}
