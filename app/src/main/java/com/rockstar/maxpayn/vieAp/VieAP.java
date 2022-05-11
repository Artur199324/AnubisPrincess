package com.rockstar.maxpayn.vieAp;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AndroidViewModel;

import com.rockstar.maxpayn.actAp.ApAct;
import com.rockstar.maxpayn.modAP.ConAP;
import com.rockstar.maxpayn.modAP.DataAP;
import com.rockstar.maxpayn.modAP.DisAP;
import com.rockstar.maxpayn.modAP.G1;
import com.rockstar.maxpayn.modAP.G2;
import com.rockstar.maxpayn.modAP.G3;
import com.rockstar.maxpayn.modAP.IdAP;
import com.rockstar.maxpayn.modAP.LodiAP;
import com.rockstar.maxpayn.modAP.Mov1;
import com.rockstar.maxpayn.modAP.SaveAP;
import com.rockstar.maxpayn.modAP.T1;
import com.rockstar.maxpayn.modAP.T2;
import com.rockstar.maxpayn.modAP.WeAp;

import java.util.ArrayList;

public class VieAP extends AndroidViewModel {
    G1 g1;
    T1 t1;
    DisAP disAP;
    Mov1 mov1;
    G2 g2;
    G3 g3;
    T2 t2;
    LodiAP lodiAP;
    DataAP dataAP;
    IdAP idAP;
    ConAP conAP;
    public static ValueCallback<Uri> bfdsa;
    public static Uri bbbfd = null;
    public static ValueCallback<Uri[]> zzzdsvd;
    public static String bbfdsa;
    public static final int bbdaac = 1;
    WeAp weAp;
    SaveAP saveAP;

    public VieAP(@NonNull Application application) {
        super(application);
        weAp = new WeAp();
        saveAP = new SaveAP();
        g1 = new G1();
        t1 = new T1();
        disAP = new DisAP();
        mov1 = new Mov1();
        g2 = new G2();
        g3 = new G3();
        t2 = new T2();
        lodiAP = new LodiAP();
        dataAP = new DataAP();
        idAP = new IdAP();
        conAP = new ConAP();
    }

    public void jkk(ApAct apAct){
        saveAP.setApAct(apAct);
    }

    public void uhu(String sss){
        saveAP.saveAp(sss);
    }
    public String kkkl(){
        saveAP.getSaveApp();
        return saveAP.getSaveAP();
    }

    public String kfk(ApAct apAct){
        return dataAP.parseOrgAp(apAct);
    }
    public void loadAP(WebView webView, ApAct apAct, String lll) {
        weAp.gg(webView,apAct,lll);
    }

    public DataAP dataAPp(){
        return dataAP;
    }

    public void kfj(ApAct apAct) {
        conAP.appAp(dataAP, apAct);
    }

    public void hd(ApAct apAct) {
        conAP.deepAP(dataAP, apAct);
    }

    public void gfd(ApAct apAct) {
        idAP.idAP(dataAP, apAct);

    }

    public void ll(ApAct apAct) {
        conAP.conFireAp(dataAP, apAct);
    }

    public void gf(int[] a, TextView textView, ApAct apAct) {
        lodiAP.fff(a, textView, apAct);
    }

    public void ljl(TextView textView, int h) {
        mov1.lll(textView, h);
    }

    public void jjk(CardView card1, CardView card3) {
        mov1.ppp(card1, card3);
    }

    public int kkk(ArrayList<ImageView> arrayList, int counter) {
        return t2.yyy(arrayList, counter);
    }

    public void jjj(ArrayList<ImageView> arrayList) {
        g3.kfh(arrayList);
    }

    public void kkj(CardView card1, CardView card2, CardView card3) {
        mov1.ooo(card1, card2, card3);
    }

    public void kjl(CardView card1, CardView card2) {
        mov1.www(card2, card1);
    }

    public void ooi(ArrayList<ImageView> arrayList) {
        g2.jjk(arrayList);
    }

    public void kkk(CardView cardView, CardView card1, int h) {
        mov1.vvv(cardView, card1, h);
    }

    public DisAP disAP(Display display) {
        disAP.kk(display);
        return disAP;
    }

    public void ghg(ArrayList<ImageView> arrayList) {
        g1.vv(arrayList);
    }

    public int jj(ArrayList<ImageView> arrayList, int counterAs) {
        return t1.ff(arrayList, counterAs);
    }
}
