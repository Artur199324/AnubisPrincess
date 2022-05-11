package com.rockstar.maxpayn.modAP;

import com.rockstar.maxpayn.R;
import com.rockstar.maxpayn.actAp.ApAct;

import org.apache.commons.codec.binary.Base32;

public class DataAP {

    private String af_statusAP = "-";
    private String media_sourceAp;
    private String af_channelAp;
    private String campaignAP;
    private String strAppsFlyerAP = "-";

    private String deepAP = null;
    private String strDeppAP = "-";

    private String AIDAP;
    private String apps_idAP;

    private String statusAP = "fdfff";
    private String urlAP;

    String hhh;
    private String[] dd = {decodeAP("EZZXKYRRHU======"), decodeAP("EZZXKYRSHU======"), decodeAP("EZZXKYRTHU======"), decodeAP("EZZXKYRUHU======"), decodeAP("EZZXKYRVHU======"), decodeAP("EZZXKYRWHU======"), decodeAP("EZZXKYRXHU======"), decodeAP("EZZXKYRYHU======"), decodeAP("EZZXKYRZHU======"), decodeAP("EZZXKYRRGA6Q====")};
    private String[] ii = {decodeAP("EZRWC3LQMFUWO3R5"), decodeAP("EZTW633HNRSV6YLENFSD2==="), decodeAP("EZQWMX3VONSXE2LEHU======"), decodeAP("EZQWMX3DNBQW43TFNQ6Q===="), decodeAP("EZSGK5S7NNSXSPI="), decodeAP("EZRHK3TENRST2==="), decodeAP("EZTGEX3BOBYF62LEHU======"), decodeAP("EZTGEX3BOQ6Q====")};

    public String getAf_statusAP() {
        return af_statusAP;
    }

    public void setAf_statusAP(String af_statusAP) {
        this.af_statusAP = af_statusAP;
    }

    public String getMedia_sourceAp() {
        return media_sourceAp;
    }

    public void setMedia_sourceAp(String media_sourceAp) {
        this.media_sourceAp = media_sourceAp;
    }

    public String getAf_channelAp() {
        return af_channelAp;
    }

    public void setAf_channelAp(String af_channelAp) {
        this.af_channelAp = af_channelAp;
    }

    public String getCampaignAP() {
        return campaignAP;
    }

    public void setCampaignAP(String campaignAP) {
        this.campaignAP = campaignAP;
    }

    public String getStrAppsFlyerAP() {
        return strAppsFlyerAP;
    }

    public void setStrAppsFlyerAP(String strAppsFlyerAP) {
        this.strAppsFlyerAP = strAppsFlyerAP;
    }

    public String getDeepAP() {
        return deepAP;
    }

    public void setDeepAP(String deepAP) {
        this.deepAP = deepAP;
    }

    public String getStrDeppAP() {
        return strDeppAP;
    }

    public void setStrDeppAP(String strDeppAP) {
        this.strDeppAP = strDeppAP;
    }

    public String getAIDAP() {
        return AIDAP;
    }

    public void setAIDAP(String AIDAP) {
        this.AIDAP = AIDAP;
    }

    public String getApps_idAP() {
        return apps_idAP;
    }

    public void setApps_idAP(String apps_idAP) {
        this.apps_idAP = apps_idAP;
    }

    public String getStatusAP() {
        return statusAP;
    }

    public void setStatusAP(String statusAP) {
        this.statusAP = statusAP;
    }

    public String getUrlAP() {
        return urlAP;
    }

    public void setUrlAP(String urlAP) {
        this.urlAP = urlAP;
    }

    public static String decodeAP(String base32DataAP) {
        Base32 base32AP = new Base32();
        byte[] decodedBytesAP = base32AP.decode(base32DataAP);
        return new String(decodedBytesAP);
    }

    public String parseAP(String s, ApAct apAct) {
        String[] fv = s.split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dd.length; i++) {
            try {
                stringBuilder.append(dd[i]);
                stringBuilder.append(fv[i]);

            } catch (Exception e) {

            }
        }

        try {
            String campaignAps = ii[0] + getCampaignAP();
            String google_adidAps = ii[1] + getAIDAP();
            String af_useridAps = ii[2] + getApps_idAP();
            String af_channelAps = ii[3] + getAf_channelAp();
            String dev_keyAps = ii[4] + apAct.getResources().getString(R.string.app);
            String bundleAps = ii[5] + apAct.getPackageName();
            String fb_app_idAps = ii[6] + apAct.getResources().getString(R.string.f);
            String fb_atAps = ii[7] + apAct.getResources().getString(R.string.t);
            hhh = decodeAP("H5WWKZDJMFPXG33VOJRWKPI=") + getMedia_sourceAp() + stringBuilder
                    + campaignAps + google_adidAps + af_useridAps + af_channelAps + dev_keyAps + bundleAps + fb_app_idAps + fb_atAps;
        } catch (Exception e) {

        }

        return hhh;

    }

    public String parseOrgAp(ApAct apAct) {
        String google_adidAps = ii[1] + getAIDAP();
        String af_useridAps = ii[2] + getApps_idAP();
        String af_channelAps = ii[3] + getAf_channelAp();
        String dev_keyAps = ii[4] + apAct.getResources().getString(R.string.app);
        String bundleAps = ii[5] + apAct.getPackageName();
        String fb_app_idAps = ii[6] + apAct.getResources().getString(R.string.f);
        String fb_atAps = ii[7] + apAct.getResources().getString(R.string.t);
        return decodeAP("H5WWKZDJMFPXG33VOJRWKPLPOJTWC3TJMM======") + google_adidAps + af_useridAps
                + af_channelAps + dev_keyAps + bundleAps + fb_app_idAps + fb_atAps;
    }
}
