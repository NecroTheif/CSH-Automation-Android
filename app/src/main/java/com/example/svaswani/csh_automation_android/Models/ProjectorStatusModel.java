package com.example.svaswani.csh_automation_android.Models;

/**
 * Created by svaswani on 2/16/2016.
 */
public class ProjectorStatusModel {

    private boolean success;
    public boolean getSuccess() {return success;}
    public void setSuccess(boolean success) {this.success = success;}

    private ProjectorModel projector;

}

class ProjectorModel {

    private String power;
    private String getPower() {return power;}
    public void setPower(String power) {this.power = power;}

    private String input;
    private String getInput() {return input;}
    public void setInput(String input) {this.input = input;}

    private int hours;
    private int getHours() {return hours;}
    public void setHours(int hours) {this.hours = hours;}

    private boolean blank;
    private boolean getBlank() {return blank;}
    public void setBlank(boolean blank) {this.blank = blank;}

    private ProjectorSourcesModel sources;
}

class ProjectorSourcesModel {

    private String HDMI1;
    private String getHDMI1() {return HDMI1;}
    public void setHDMI1(String HDMI1) {this.HDMI1 = HDMI1;}

    private String HDMI2;
    private String getHDMI2() {return HDMI2;}
    public void setHDMI2(String HDMI2) {this.HDMI2 = HDMI2;}

    private String computer1;
    private String getComputer1() {return computer1;}
    public void setComputer1(String computer1) {this.computer1 = computer1;}

    private String computer2;
    private String getComputer2() {return computer2;}
    public void setComputer2(String computer2) {this.computer2 = computer2;}

    private String composite;
    private String getComposite() {return composite;}
    public void setComposite(String composite) {this.composite = composite;}
}
