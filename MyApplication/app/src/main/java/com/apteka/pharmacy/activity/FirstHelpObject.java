package com.apteka.pharmacy.activity;

public class FirstHelpObject {
    String firstHelpName;
    String firstHelpImage;

    public FirstHelpObject() {

    }
    FirstHelpObject(String firstHelpName, String firstHelpImage) {
        this.firstHelpName = firstHelpName;
        this.firstHelpImage = firstHelpImage;

    }
    public String getFirstHelpName() {
        return firstHelpName;
    }

    public void setFirstHelpName(String firstHelpName) {
        this.firstHelpName = firstHelpName;
    }

    public String getFirstHelpImage() {
        return firstHelpImage;
    }

    public void setFirstHelpImage(String firstHelpImage) {
        this.firstHelpImage = firstHelpImage;
    }
//
//    @Override
//    public String toString() {
//        return "FirstHelpObject{" +
//                "firstHelpName='" + firstHelpName + '\'' +
//                ", firstHelpImage='" + firstHelpImage + '\'' +
//                '}';
//    }
}