package com.rockstar.maxpayn.actAp;

import static com.rockstar.maxpayn.actAp.ApAct.vieAP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rockstar.maxpayn.R;
import com.rockstar.maxpayn.modAP.DisAP;

import java.util.ArrayList;

public class GamAP extends AppCompatActivity {


    private CardView card1,card2,card3;
    private ImageView vdvz, nfdvg, nffdjhd;
    private ImageView bfdvdf, hhfgds, nfds;
    private ImageView ngfss, rtesd, utrfggf, jjjgy, nngfd, mgftf;
    private TextView nfd;
    private Button bfbf, bfdd, vdfe;
    private ArrayList<ImageView> arrayListIm1;
    private ArrayList<ImageView> arrayListIm2;
    private ArrayList<ImageView> arrayListIm3;
    private int counterAp = 100;
    private ConstraintLayout constrAP;
    private Display displayAP;
    private DisAP disAP;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        constrAP = findViewById(R.id.constr);
        vdfe = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        displayAP = getWindowManager().getDefaultDisplay();
        disAP = vieAP.disAP(displayAP);
        ii();
        oo();
        pp();
        counterAp = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("dd", 100);
        nfd = findViewById(R.id.textView);
        nfd.setText("Points : "+counterAp);
        bfbf = findViewById(R.id.button);
        bfbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vieAP.ghg(arrayListIm1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        counterAp = vieAP.jj(arrayListIm1,counterAp);
                        nfd.setText("Points : "+counterAp);
                        hh();
                        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("dd", counterAp).apply();
                    }
                },1000);
            }
        });
        bfdd = findViewById(R.id.button1);
        bfdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vieAP.jjj(arrayListIm3);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        counterAp = vieAP.kkk(arrayListIm3,counterAp);
                        nfd.setText("Points : "+counterAp);
                        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("dd", counterAp).apply();
                        kk();
                    }
                },1000);
            }
        });

        vdfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GamAP.class));
                finishAffinity();
            }
        });

        ijj();
    }

    private void ijj(){
        bfdvdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lll(bfdvdf);
            }
        });

        hhfgds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lll(hhfgds);
            }
        });

        nfds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lll(nfds);
            }
        });
    }

    private void tos1(){
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toast1,
                (ViewGroup) findViewById(R.id.consTost));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 100, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    private void tos2(){
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toast2,
                (ViewGroup) findViewById(R.id.consTost2));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 100, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    private void tos3(){
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.tost3,
                (ViewGroup) findViewById(R.id.consTost3));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 100, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    private void tos4(){
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toast4,
                (ViewGroup) findViewById(R.id.consTost4));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 100, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    private void lll(ImageView imageView){
        int fff = (int) imageView.getTag();
        if (fff == 1){
            imageView.setImageResource(R.drawable.ss5);
            counterAp = counterAp*2;
            vieAP.kkj(card1,card2,card3);
            bfdd.setVisibility(View.VISIBLE);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("dd", counterAp).apply();
            tos3();
        }else {
            counterAp = counterAp/2;
            imageView.setImageResource(R.drawable.ss9);
            vieAP.kjl(card1,card2);
            bfbf.setVisibility(View.VISIBLE);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("dd", counterAp).apply();
            tos2();
        }
        bfdvdf.setClickable(false);
        hhfgds.setClickable(false);
        nfds.setClickable(false);
        nfd.setText("Points : "+counterAp);

    }

    private void kk(){

        if (counterAp<=200){
            vieAP.jjk(card1,card3);
            bfbf.setVisibility(View.VISIBLE);
            bfdd.setVisibility(View.INVISIBLE);
            tos4();
        }
    }
    private void hh(){
        if (counterAp >=110){
            card2.setVisibility(View.VISIBLE);
            vieAP.kkk(card2,card1,disAP.getHeightAp());
            vieAP.ooi(arrayListIm2);
            bfdvdf.setClickable(true);
            hhfgds.setClickable(true);
            nfds.setClickable(true);
            bfdvdf.setImageResource(R.drawable.ss3);
            hhfgds.setImageResource(R.drawable.ss3);
            nfds.setImageResource(R.drawable.ss3);
            bfbf.setVisibility(View.INVISIBLE);
            tos1();

        }else if(counterAp<= 0){
            bfbf.setVisibility(View.INVISIBLE);
            vdfe.setVisibility(View.VISIBLE);
            nfd.setText("Points : "+0);
            card1.setVisibility(View.INVISIBLE);
            vieAP.ljl(textView2,disAP.getHeightAp());
            counterAp = 100;
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("dd", counterAp).apply();
        }
    }
    private void ii(){
        vdvz = findViewById(R.id.imageView2);
        nfdvg = findViewById(R.id.imageView3);
        nffdjhd = findViewById(R.id.imageView4);
        arrayListIm1 = new ArrayList<>();
        arrayListIm1.add(vdvz);
        arrayListIm1.add(nfdvg);
        arrayListIm1.add(nffdjhd);
    }

    private void oo(){
        bfdvdf = findViewById(R.id.imageView5);
        hhfgds = findViewById(R.id.imageView6);
        nfds = findViewById(R.id.imageView7);
        arrayListIm2 = new ArrayList<>();
        arrayListIm2.add(bfdvdf);
        arrayListIm2.add(hhfgds);
        arrayListIm2.add(nfds);
    }

    private void pp(){
        ngfss = findViewById(R.id.imageView10);
        rtesd = findViewById(R.id.imageView9);
        utrfggf = findViewById(R.id.imageView11);
        jjjgy = findViewById(R.id.imageView12);
        nngfd = findViewById(R.id.imageView13);
        mgftf = findViewById(R.id.imageView14);
        arrayListIm3 = new ArrayList<>();
        arrayListIm3.add(ngfss);
        arrayListIm3.add(rtesd);
        arrayListIm3.add(utrfggf);
        arrayListIm3.add(jjjgy);
        arrayListIm3.add(nngfd);
        arrayListIm3.add(mgftf);
    }
}