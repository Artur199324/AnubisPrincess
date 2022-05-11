package com.rockstar.maxpayn.modAP;

import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.rockstar.maxpayn.actAp.ApAct;
import com.rockstar.maxpayn.actAp.GamAP;

public class WebViewClientAP extends WebViewClient {

    ApAct apAct;
    WebView webViewFullAppAP;

    public WebViewClientAP(ApAct apAct, WebView webViewFullAppAP) {
        this.apAct = apAct;
        this.webViewFullAppAP = webViewFullAppAP;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if (url.contains(decodeAP("MVZHE33SHVQXA4DBMZAXGM3G")) || url.contains(decodeAP("MRUXGYLCNRSWILTIORWWY==="))) {
            webViewFullAppAP.setVisibility(View.INVISIBLE);
            apAct.button33.setVisibility(View.VISIBLE);
            apAct.button4.setVisibility(View.VISIBLE);
            apAct.textView4.setVisibility(View.INVISIBLE);
            apAct.button33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    apAct.startActivity(new Intent(apAct.getApplicationContext(), GamAP.class));
                    apAct.finishAffinity();
                }
            });
            apAct.button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    apAct.finish();
                }
            });
        }
    }
}
