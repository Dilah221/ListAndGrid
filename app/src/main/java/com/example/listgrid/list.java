package com.example.listgrid;

public class list {
    private String judul;
    private String subjudul;
    private String image;

    public list(String judul, String subjudul, String image){
        this.judul = judul;
        this.subjudul = subjudul;
        this.image = image;
    }
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
