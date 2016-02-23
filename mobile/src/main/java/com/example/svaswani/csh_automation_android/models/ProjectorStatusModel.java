package com.example.svaswani.csh_automation_android.models;

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

    private String HDMI_1;
    private String getHDMI_1() {return HDMI_1;}
    public void setHDMI_1(String HDMI_1) {this.HDMI_1 = HDMI_1;}

    private String HDMI_2;
    private String getHDMI_2() {return HDMI_2;}
    public void setHDMI_2(String HDMI_2) {this.HDMI_2 = HDMI_2;}

    private String computer_1;
    private String getComputer_1() {return computer_1;}
    public void setComputer_1(String computer_1) {this.computer_1 = computer_1;}

    private String computer_2;
    private String getComputer_2() {return computer_2;}
    public void setComputer_2(String computer_2) {this.computer_2 = computer_2;}

    private String composite;
    private String getComposite() {return composite;}
    public void setComposite(String composite) {this.composite = composite;}
}
