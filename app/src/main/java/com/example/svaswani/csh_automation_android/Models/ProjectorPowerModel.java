package com.example.svaswani.csh_automation_android.Models;

/**
 * Created by svaswani on 2/17/2016.
 */
public class ProjectorPowerModel {

    private boolean success;
    public boolean getSuccess() {return success;}
    public void setSuccess(boolean success) {this.success = success;}

    private ProjectorModelOnOff onOff;

}

class ProjectorModelOnOff {

    private String power;
    private String getPower() {return power;}
    public void setPower(String power) {this.power = power;}

}
