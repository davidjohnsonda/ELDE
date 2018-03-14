package src.jde.common;

import com.jme3.app.SimpleApplication;
import com.jme3.app.state.BaseAppState;

public abstract class JdeAppState<T extends SimpleApplication> extends BaseAppState{

    protected T getApp() {
        return ((T) getApplication());
    }

}
