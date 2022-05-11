package com.rockstar.maxpayn.modAP;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class G2 {

    public void jjk(ArrayList<ImageView> arrayList){
        Random random = new Random();
        new Thread(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(3)){
                    case 0:
                        arrayList.get(0).setTag(1);
                        arrayList.get(1).setTag(0);
                        arrayList.get(2).setTag(0);
                        break;
                    case 1:
                        arrayList.get(0).setTag(0);
                        arrayList.get(1).setTag(1);
                        arrayList.get(2).setTag(0);
                        break;
                    case 2:
                        arrayList.get(0).setTag(0);
                        arrayList.get(1).setTag(0);
                        arrayList.get(2).setTag(1);
                        break;
                }
            }
        }).start();
    }
}
