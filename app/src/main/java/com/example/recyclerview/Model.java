
package com.example.recyclerview.model;

public class Model {
    private String title;
    private String subtitle;
    private int imageId;

    public Model(String title, String subtitle, int imageId) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getImageId() {
        return imageId;
    }
}
