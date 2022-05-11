package com.rockstar.maxpayn.modAP;

import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.rockstar.maxpayn.actAp.ApAct;

public class WeAp {

    public void gg(WebView webViewFullAppAP , ApAct apAct , String lodAP){
        webViewFullAppAP.getSettings().setJavaScriptEnabled(true);
        webViewFullAppAP.getSettings().setDomStorageEnabled(true);
        webViewFullAppAP.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppAP.clearCache(false);
        webViewFullAppAP.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        webViewFullAppAP.setWebChromeClient(new WebChromeClientAP(apAct));
        webViewFullAppAP.setWebViewClient(new WebViewClientAP(apAct,webViewFullAppAP));
        webViewFullAppAP.setVisibility(View.VISIBLE);
        webViewFullAppAP.loadUrl(lodAP);
    }
}
