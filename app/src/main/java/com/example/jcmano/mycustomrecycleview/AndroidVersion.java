package com.example.jcmano.mycustomrecycleview;

/**
 * Created by JCMANO on 14/09/2017.
 */

public class AndroidVersion {
    int logo;
    String codename, version, api, date;

    public AndroidVersion(int logo, String codename, String version, String api, String date) {
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
