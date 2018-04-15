package com.cy.cyflowlayout;

/**
 * Created by cy on 2018/4/14.
 */

public class LayoutBean {
    private String text ;
    private int resID;

    public LayoutBean(String text, int resID) {
        this.text = text;
        this.resID = resID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }
}
