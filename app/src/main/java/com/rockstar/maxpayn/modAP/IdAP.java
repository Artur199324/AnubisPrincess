package com.rockstar.maxpayn.modAP;

import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.rockstar.maxpayn.actAp.ApAct;

public class IdAP {

    public void idAP(DataAP dataAP , ApAct apAct){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dataAP.setAIDAP(AdvertisingIdClient.getAdvertisingIdInfo(apAct.getApplicationContext()).getId());
                }catch (Exception e){

                }
            }
        }).start();

        dataAP.setApps_idAP(AppsFlyerLib.getInstance().getAppsFlyerUID(apAct.getApplicationContext()));

    }
}
