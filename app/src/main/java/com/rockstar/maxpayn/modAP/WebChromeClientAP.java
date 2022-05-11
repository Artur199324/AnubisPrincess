package com.rockstar.maxpayn.modAP;

import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;
import static com.rockstar.maxpayn.vieAp.VieAP.zzzdsvd;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.rockstar.maxpayn.actAp.ApAct;

public class WebChromeClientAP extends WebChromeClient {

    ApAct apAct;

    public WebChromeClientAP(ApAct apAct) {
        this.apAct = apAct;
    }

    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> ccs,
                                     FileChooserParams ccsj) {
        if (zzzdsvd != null) {
            zzzdsvd.onReceiveValue(null);
        }
        zzzdsvd = ccs;
        Intent xxxx = new Intent(Intent.ACTION_GET_CONTENT);
        xxxx.addCategory(Intent.CATEGORY_OPENABLE);
        xxxx.setType("*/*");
        Intent[] vvvv = new Intent[0];
        Intent zzzzz = new Intent(Intent.ACTION_CHOOSER);
        zzzzz.putExtra(Intent.EXTRA_INTENT, xxxx);
        zzzzz.putExtra(Intent.EXTRA_TITLE, decodeAP("KNSWYZLDOQQE64DUNFXW4OQ="));
        zzzzz.putExtra(Intent.EXTRA_INITIAL_INTENTS, vvvv);
        apAct.startActivityForResult(zzzzz, 1);
        return true;
    }
}
