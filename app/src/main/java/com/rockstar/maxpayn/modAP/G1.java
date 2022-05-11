package com.rockstar.maxpayn.modAP;

import android.os.Handler;
import android.widget.ImageView;

import com.rockstar.maxpayn.R;

import java.util.ArrayList;
import java.util.Random;

public class G1 {

    int df = 0;
    public void vv(ArrayList<ImageView> arrayList){
        Random random = new Random();
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                df++;
                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(0).setImageResource(R.drawable.ss1);
                        arrayList.get(0).setTag(1);
                        break;
                    case 1:
                        arrayList.get(0).setImageResource(R.drawable.ss2);
                        arrayList.get(0).setTag(2);
                        break;
                    case 2:
                        arrayList.get(0).setImageResource(R.drawable.ss4);
                        arrayList.get(0).setTag(3);
                        break;
                    case 3:
                        arrayList.get(0).setImageResource(R.drawable.ss7);
                        arrayList.get(0).setTag(4);
                        break;
                    case 4:
                        arrayList.get(0).setImageResource(R.drawable.ss8);
                        arrayList.get(0).setTag(5);
                        break;
                }

                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(1).setImageResource(R.drawable.ss1);
                        arrayList.get(1).setTag(1);
                        break;
                    case 1:
                        arrayList.get(1).setImageResource(R.drawable.ss2);
                        arrayList.get(1).setTag(2);
                        break;
                    case 2:
                        arrayList.get(1).setImageResource(R.drawable.ss4);
                        arrayList.get(1).setTag(3);
                        break;
                    case 3:
                        arrayList.get(1).setImageResource(R.drawable.ss7);
                        arrayList.get(1).setTag(4);
                        break;
                    case 4:
                        arrayList.get(1).setImageResource(R.drawable.ss8);
                        arrayList.get(1).setTag(5);
                        break;
                }
                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(2).setImageResource(R.drawable.ss1);
                        arrayList.get(2).setTag(1);
                        break;
                    case 1:
                        arrayList.get(2).setImageResource(R.drawable.ss2);
                        arrayList.get(2).setTag(2);
                        break;
                    case 2:
                        arrayList.get(2).setImageResource(R.drawable.ss4);
                        arrayList.get(2).setTag(3);
                        break;
                    case 3:
                        arrayList.get(2).setImageResource(R.drawable.ss7);
                        arrayList.get(2).setTag(4);
                        break;
                    case 4:
                        arrayList.get(2).setImageResource(R.drawable.ss8);
                        arrayList.get(2).setTag(5);
                        break;
                }



                if (df !=30){
                    handler.postDelayed(this::run,10);
                }else {
                    df = 0;
                }
            }
        });

    }
}
