package com.rockstar.maxpayn.modAP;

import android.widget.ImageView;

import java.util.ArrayList;

public class T2 {

    private int counterAP;


    public int yyy(ArrayList<ImageView> arrayList , int conter){
        counterAP = conter;
        int a = (int) arrayList.get(0).getTag();
        int b = (int) arrayList.get(1).getTag();
        int c = (int) arrayList.get(2).getTag();
        int v = (int) arrayList.get(3).getTag();
        int n = (int) arrayList.get(4).getTag();
        int m = (int) arrayList.get(5).getTag();

        if (a == b || b == c || a == c){
            counterAP += 100;

        }else {
            counterAP -=  150;
        }

        if (v == n || n == m|| v==m){
            counterAP += 100;

        }else {
            counterAP -=  150;
        }


        return counterAP;
    }
}
