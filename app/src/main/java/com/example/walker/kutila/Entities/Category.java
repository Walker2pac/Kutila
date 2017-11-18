package com.example.walker.kutila.Entities;

/**
 * Created by walker on 18.11.2017.
 */

public class Category {

    private String titleRu;
    private String titleEng;
    private int thumbnail;

    public Category() {
    }

    public Category(String titleRu, String titleEng, int thumbnail) {
        this.titleRu = titleRu;
        this.titleEng = titleEng;
        this.thumbnail = thumbnail;
    }

    public String getTitleRu() {
        return titleRu;
    }

    public void setTitleRu(String titleRu) {
        this.titleRu = titleRu;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
