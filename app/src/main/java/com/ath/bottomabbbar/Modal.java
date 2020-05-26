package com.ath.bottomabbbar;

public class Modal {

    String title;
    String info;
    int image;

    public Modal(String title, String info, int image) {
        this.title = title;
        this.info = info;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
