package com.example.amazon;

/**
 * Created by Eldor Turgunov on 24.05.2022.
 * Amazon
 * eldorturgunov777@gmail.com
 */
public class Essential {
    int img;
    String title;

    public Essential(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
