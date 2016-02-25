package com.example.svaswani.csh_automation_android.Models;

/**
 * Created by svaswani on 2/16/2016.
 */
public class ProjectorStatusModel {

    private boolean success;
    public boolean getSuccess() {return success;}
    public void setSuccess(boolean success) {this.success = success;}

    public ProjectorModel projector;

}

class ProjectorSourcesModel {

    public String HDMI1;
    public String getHDMI1() {return HDMI1;}
    public void setHDMI1(String HDMI1) {this.HDMI1 = HDMI1;}

    public String HDMI2;
    public String getHDMI2() {return HDMI2;}
    public void setHDMI2(String HDMI2) {this.HDMI2 = HDMI2;}

    public String computer1;
    public String getComputer1() {return computer1;}
    public void setComputer1(String computer1) {this.computer1 = computer1;}

    public String computer2;
    public String getComputer2() {return computer2;}
    public void setComputer2(String computer2) {this.computer2 = computer2;}

    public String composite;
    public String getComposite() {return composite;}
    public void setComposite(String composite) {this.composite = composite;}
}
