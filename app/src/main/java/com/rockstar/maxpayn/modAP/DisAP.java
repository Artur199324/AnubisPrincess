package com.rockstar.maxpayn.modAP;

import android.view.Display;

public class DisAP {

    private int widthAp;
    private int heightAp;

    public int getWidthAp() {
        return widthAp;
    }

    public void setWidthAp(int widthAp) {
        this.widthAp = widthAp;
    }

    public int getHeightAp() {
        return heightAp;
    }

    public void setHeightAp(int heightAp) {
        this.heightAp = heightAp;
    }

    public void kk(Display displayAP){
        widthAp = displayAP.getWidth();
        heightAp = displayAP.getHeight();
    }
}
