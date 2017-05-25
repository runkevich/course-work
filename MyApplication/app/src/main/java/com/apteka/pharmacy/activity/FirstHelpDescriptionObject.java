package com.apteka.pharmacy.activity;

/**
 * Created by Ека on 22.05.2017.
 */

public class FirstHelpDescriptionObject {
    String fhdSimptom;
    String fhdImage;
    String fhdHelp1;
    String fhdImage1;
    String fhdHelp2;
    String fhdImage2;
    String fhdWarning1;

    public FirstHelpDescriptionObject() {

    }




    FirstHelpDescriptionObject(String fhdSimptom, String fhdImage, String fhdHelp1, String fhdImage1,
                               String fhdHelp2, String fhdImage2, String fhdWarning1) {
        this.fhdSimptom = fhdSimptom;
        this.fhdImage = fhdImage;
        this.fhdHelp1 = fhdHelp1;
        this.fhdImage1 = fhdImage1;
        this.fhdHelp2 = fhdHelp2;
        this.fhdImage2 = fhdImage2;
        this.fhdWarning1 = fhdWarning1;
    }
    public String getFhdWarning1() {
        return fhdWarning1;
    }

    public void setFhdWarning1(String fhdWarning1) {
        this.fhdWarning1 = fhdWarning1;
    }
    public String getFhdImage2() {
        return fhdImage2;
    }

    public void setFhdImage2(String fhdImage2) {
        this.fhdImage2 = fhdImage2;
    }

    public String getFhdHelp2() {
        return fhdHelp2;
    }

    public void setFhdHelp2(String fhdHelp2) {
        this.fhdHelp2 = fhdHelp2;
    }
    public String getFhdImage1() {
        return fhdImage1;
    }

    public void setFhdImage1(String fhdImage1) {
        this.fhdImage1 = fhdImage1;
    }
    public String getFhdHelp1() {
        return fhdHelp1;
    }

    public void setFhdHelp1(String fhdHelp1) {
        this.fhdHelp1 = fhdHelp1;
    }

    public String getFhdImage() {
        return fhdImage;
    }

    public void setFhdImage(String fhdImage) {
        this.fhdImage = fhdImage;
    }


    public String getFhdSimptom() {
        return fhdSimptom;
    }

    public void setFhdSimptom(String fhdSimptom) {
        this.fhdSimptom = fhdSimptom;
    }
}