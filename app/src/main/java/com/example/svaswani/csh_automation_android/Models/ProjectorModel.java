package com.example.svaswani.csh_automation_android.Models;

public class ProjectorModel {

    public boolean power;
    public boolean getPower() {return power;}
    public void setPower(boolean power) {this.power = power;}

    public String input;
    public String getInput() {return input;}
    public void setInput(String input) {this.input = input;}

    public int hours;
    public int getHours() {return hours;}
    public void setHours(int hours) {this.hours = hours;}

    public boolean blank;
    public boolean getBlank() {return blank;}
    public void setBlank(boolean blank) {this.blank = blank;}

    public ProjectorSourcesModel sources;
}
