package com.rockstar.maxpayn.modAP;

import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;

import com.rockstar.maxpayn.actAp.ApAct;

public class SaveAP {

    private String saveAP;
    private ApAct apAct;

    public String getSaveAP() {
        return saveAP;
    }

    public void setSaveAP(String saveAP) {
        this.saveAP = saveAP;
    }

    public ApAct getApAct() {
        return apAct;
    }

    public void setApAct(ApAct apAct) {
        this.apAct = apAct;
    }

    public void saveAp(String ss){
        apAct.getSharedPreferences(apAct.getPackageName(), apAct.MODE_PRIVATE).edit().putString(decodeAP("ONQXMZI="), ss).apply();
    }

    public void getSaveApp(){
        setSaveAP(apAct.getSharedPreferences(apAct.getPackageName(), apAct.MODE_PRIVATE).getString(decodeAP("ONQXMZI="), decodeAP("NZXG4===")));
    }
}
