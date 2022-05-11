package com.rockstar.maxpayn.modAP;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class T1 {

    private int countAP;

    public int ff(ArrayList<ImageView> arrayList, int counter) {
        countAP = counter;
        int a = (int) arrayList.get(0).getTag();
        int b = (int) arrayList.get(1).getTag();
        int c = (int) arrayList.get(2).getTag();

        if (a == b || b == c || a == c) {
            countAP += 50;
        } else {
            countAP -= 25;
        }
        return countAP;
    }
}
