package com.example.student.huynhcaohuulinh_16035801;

public class LinkObject {
    private String name;
    private int image;
    private String url;

    public LinkObject(String name, int image, String url) {
        this.name = name;
        this.image = image;
        this.url = url;
    }


    public int getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
