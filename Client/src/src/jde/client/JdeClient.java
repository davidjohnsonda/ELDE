package src.jde.client;

import com.jme3.app.SimpleApplication;
import src.jde.client.networking.NetworkAppState;

public class JdeClient extends SimpleApplication{

    public static void main(String[] args){
        new JdeClient().start();
    }

    @Override
    public void simpleInitApp(){
        flyCam.setDragToRotate(true);
        stateManager.attach(new NetworkAppState());
    }

}
