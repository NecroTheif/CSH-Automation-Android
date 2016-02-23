package com.example.svaswani.csh_automation_android.Models;

/**
 * Created by svaswani on 2/23/2016.
 */
public class RadiatorStatusModel {

    private boolean success;
    public boolean getSuccess() {return success;}
    public void setSuccess(boolean success) {this.success = success;}

    private RadiatorModel radiator;
}

class RadiatorModel {

    private boolean fan;
    public boolean getFan() {return fan;}
    public void setFan(boolean fan) {this.fan = fan;}
}

