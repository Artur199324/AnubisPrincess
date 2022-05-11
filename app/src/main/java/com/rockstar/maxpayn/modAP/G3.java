package com.rockstar.maxpayn.modAP;

import android.os.Handler;
import android.widget.ImageView;

import com.rockstar.maxpayn.R;

import java.util.ArrayList;
import java.util.Random;

public class G3 {
    int ccc = 0;
    public void kfh(ArrayList<ImageView> arrayList){
        Random random = new Random();
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

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
                    case 5:
                        arrayList.get(0).setImageResource(R.drawable.ss10);
                        arrayList.get(0).setTag(6);
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
                    case 5:
                        arrayList.get(1).setImageResource(R.drawable.ss10);
                        arrayList.get(1).setTag(6);
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
                    case 5:
                        arrayList.get(2).setImageResource(R.drawable.ss10);
                        arrayList.get(2).setTag(6);
                        break;
                }

                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(3).setImageResource(R.drawable.ss1);
                        arrayList.get(3).setTag(1);
                        break;
                    case 1:
                        arrayList.get(3).setImageResource(R.drawable.ss2);
                        arrayList.get(3).setTag(2);
                        break;
                    case 2:
                        arrayList.get(3).setImageResource(R.drawable.ss4);
                        arrayList.get(3).setTag(3);
                        break;
                    case 3:
                        arrayList.get(3).setImageResource(R.drawable.ss7);
                        arrayList.get(3).setTag(4);
                        break;
                    case 4:
                        arrayList.get(3).setImageResource(R.drawable.ss8);
                        arrayList.get(3).setTag(5);
                        break;
                    case 5:
                        arrayList.get(3).setImageResource(R.drawable.ss10);
                        arrayList.get(3).setTag(6);
                        break;
                }

                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(4).setImageResource(R.drawable.ss1);
                        arrayList.get(4).setTag(1);
                        break;
                    case 1:
                        arrayList.get(4).setImageResource(R.drawable.ss2);
                        arrayList.get(4).setTag(2);
                        break;
                    case 2:
                        arrayList.get(4).setImageResource(R.drawable.ss4);
                        arrayList.get(4).setTag(3);
                        break;
                    case 3:
                        arrayList.get(4).setImageResource(R.drawable.ss7);
                        arrayList.get(4).setTag(4);
                        break;
                    case 4:
                        arrayList.get(4).setImageResource(R.drawable.ss8);
                        arrayList.get(4).setTag(5);
                        break;
                    case 5:
                        arrayList.get(4).setImageResource(R.drawable.ss10);
                        arrayList.get(4).setTag(6);
                        break;
                }

                switch (random.nextInt(5)){
                    case 0:
                        arrayList.get(5).setImageResource(R.drawable.ss1);
                        arrayList.get(5).setTag(1);
                        break;
                    case 1:
                        arrayList.get(5).setImageResource(R.drawable.ss2);
                        arrayList.get(5).setTag(2);
                        break;
                    case 2:
                        arrayList.get(5).setImageResource(R.drawable.ss4);
                        arrayList.get(5).setTag(3);
                        break;
                    case 3:
                        arrayList.get(5).setImageResource(R.drawable.ss7);
                        arrayList.get(5).setTag(4);
                        break;
                    case 4:
                        arrayList.get(5).setImageResource(R.drawable.ss8);
                        arrayList.get(5).setTag(5);
                        break;
                    case 5:
                        arrayList.get(5).setImageResource(R.drawable.ss10);
                        arrayList.get(5).setTag(6);
                        break;
                }



                ccc++;
                if (ccc != 30){
                    handler.postDelayed(this::run,10);
                }else {
                    ccc = 0;
                }
            }
        });


    }
}
