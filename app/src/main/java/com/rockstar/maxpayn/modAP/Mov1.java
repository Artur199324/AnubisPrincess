package com.rockstar.maxpayn.modAP;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class Mov1 {

    public void vvv(CardView card2, CardView card1, int height) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                card2.setY(card2.getY() + 10);

                if (card2.getY() < height / 2 - card2.getHeight() / 2) {
                    handler.postDelayed(this::run, 10);
                } else {
                    card1.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void www(CardView card2, CardView card1) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                card2.setY(card2.getY() - 10);

                if (card1.getY() <= card2.getY()) {
                    handler.postDelayed(this::run, 10);
                } else {
                    card1.setVisibility(View.VISIBLE);
                    card2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void ooo(CardView card1, CardView card2,CardView card3){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                card3.setVisibility(View.VISIBLE);
                card2.setY(card2.getY() - 10);
                card3.setY(card3.getY() + 10);

                if (card1.getY() <= card2.getY()) {
                    handler.postDelayed(this::run, 10);
                } else {
                    card2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void ppp(CardView card1,CardView card3){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                card3.setY(card3.getY() - 10);

                if (card1.getY() <= card3.getY()) {
                    handler.postDelayed(this::run, 10);
                } else {
                    card3.setVisibility(View.INVISIBLE);
                    card1.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    public void lll(TextView textView, int h){
        textView.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
               textView.setY(textView.getY()+10);

                if (textView.getY() < h / 2 - textView.getHeight() / 2) {
                    handler.postDelayed(this::run, 10);
                }

            }
        });
    }
}
