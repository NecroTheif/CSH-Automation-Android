package com.example.svaswani.csh_automation_android.Models;

/**
 * Created by svaswani on 2/23/2016.
 */

public class LightStatusModel {

    private boolean success;
    public boolean getSuccess() {return success;}
    public void setSuccess(boolean success) {this.success = success;}

    private LightModel light;
}

class LightModel {

    private boolean light1;
    public boolean getLight1() {return light1;}
    public void setLight1(boolean power) {this.light1 = power;}

    private boolean light2;
    public boolean getLight2() {return light2;}
    public void setLight2(boolean power) {this.light2 = power;}
}

