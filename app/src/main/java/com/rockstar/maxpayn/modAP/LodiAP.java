package com.rockstar.maxpayn.modAP;

import android.os.Handler;
import android.widget.TextView;

import com.rockstar.maxpayn.actAp.ApAct;

public class LodiAP {
    int gg = 0;
    public void fff(int [] a, TextView textView, ApAct apAct){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
              gg++;
              if (gg == 1){
                  textView.setText(apAct.getResources().getString(a[0]));
              }
                if (gg == 2){
                    textView.setText(apAct.getResources().getString(a[1]));
                }
                if (gg == 3){
                    textView.setText(apAct.getResources().getString(a[2]));
                }
                if (gg == 4){
                    textView.setText(apAct.getResources().getString(a[3]));
                }
                if (gg == 5){
                    textView.setText(apAct.getResources().getString(a[4]));
                    gg = 0;
                }

                handler.postDelayed(this::run,1000);
            }
        });
    }
}
