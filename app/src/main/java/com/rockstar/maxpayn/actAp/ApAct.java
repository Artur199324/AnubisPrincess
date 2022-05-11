package com.rockstar.maxpayn.actAp;

import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;
import static com.rockstar.maxpayn.vieAp.VieAP.bfdsa;
import static com.rockstar.maxpayn.vieAp.VieAP.bbfdsa;
import static com.rockstar.maxpayn.vieAp.VieAP.bbdaac;
import static com.rockstar.maxpayn.vieAp.VieAP.zzzdsvd;
import static com.rockstar.maxpayn.vieAp.VieAP.bbbfd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.onesignal.OneSignal;
import com.rockstar.maxpayn.R;
import com.rockstar.maxpayn.modAP.DataAP;
import com.rockstar.maxpayn.modAP.KK;
import com.rockstar.maxpayn.vieAp.VieAP;

public class ApAct extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        if (webViewFullAppAP.isFocused() && webViewFullAppAP.canGoBack()) {
            webViewFullAppAP.goBack();
        }
    }

    public static VieAP vieAP;
    public TextView textView4;
    int fds[];
    boolean gf;
    private WebView webViewFullAppAP;
    public Button button33, button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apact);
        vieAP = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(VieAP.class);
        textView4 = findViewById(R.id.textView4);
        fds = new int[]{R.string.l1, R.string.l2, R.string.l3, R.string.l4, R.string.l5};
        webViewFullAppAP = findViewById(R.id.webViewFullAppAP);
        button33 = findViewById(R.id.button33);
        button4 = findViewById(R.id.button4);
        vieAP.gf(fds, textView4, this);
        vieAP.gfd(this);
        vieAP.kfj(this);
        vieAP.hd(this);
        vieAP.jkk(this);
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null) {
            gf = false;
        } else {
            gf = true;
        }

        if (gf) {

            if (vieAP.kkkl().equals(decodeAP("NZXG4==="))) {

                OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
                OneSignal.initWithContext(this);
                OneSignal.setAppId(getResources().getString(R.string.oneS));
                vieAP.ll(this);
                DataAP dataAP = vieAP.dataAPp();
                KK kk = new KK(dataAP, this, webViewFullAppAP, button33, button4, textView4);
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!dataAP.getStatusAP().equals("fdfff")) {
                            kk.kk();
                        } else {
                            handler.postDelayed(this::run, 10);
                        }
                    }
                });
            } else {
                vieAP.loadAP(webViewFullAppAP, this, vieAP.kkkl());
            }



        } else {
            tos();
            Button button = findViewById(R.id.button3);
            button.setVisibility(View.VISIBLE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), ApAct.class));
                    finishAffinity();
                }
            });
        }
    }

    public void tos() {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toast5,
                (ViewGroup) findViewById(R.id.cons5));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 100, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onActivityResult(int hdaoru, int khhdsgt, @Nullable Intent pppp) {
        if (hdaoru != bbdaac || zzzdsvd == null) {
            super.onActivityResult(hdaoru, khhdsgt, pppp);
            return;
        }
        Uri[] vvvv = null;
        if (khhdsgt == Activity.RESULT_OK) {
            if (pppp == null) {
                if (bbfdsa != null) {
                    vvvv = new Uri[]{Uri.parse(bbfdsa)};
                }
            } else {
                String hhg = pppp.getDataString();
                if (hhg != null) {
                    vvvv = new Uri[]{Uri.parse(hhg)};
                }
            }
        }
        zzzdsvd.onReceiveValue(vvvv);
        zzzdsvd = null;
        if (bfdsa == null) {
            super.onActivityResult(hdaoru, khhdsgt, pppp);
            return;
        }
        Uri nnnnn = null;
        try {
            if (khhdsgt != RESULT_OK) {
                nnnnn = null;
            } else {
                nnnnn = pppp == null ? bbbfd : pppp.getData();
            }
        } catch (Exception e) {
        }
        bfdsa.onReceiveValue(nnnnn);
        bfdsa = null;
    }
}
