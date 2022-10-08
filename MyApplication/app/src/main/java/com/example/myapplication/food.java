package com.example.myapplication;


public class food {
    private String moTaChiTiet;
    private String foodXuHuong;
    private String tenfood;

    private int img;
    private String moTa;
    public food(String foodXuHuong, String tenfood, int img, String moTa) {
        this.tenfood = tenfood;
        this.img = img;
        this.moTa = moTa;
        this.foodXuHuong=foodXuHuong;
    }


    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public food(String dungLuong, String moTaChiTiet, String tenfood, int img, String moTa) {

        this.moTaChiTiet = moTaChiTiet;
        this.tenfood = tenfood;
        this.img = img;
        this.moTa = moTa;
    }

    public food(String tenfood, int img, String moTa) {
        this.tenfood = tenfood;
        this.img = img;
        this.moTa = moTa;
    }

    public food() {
    }

    public String getFoodXuHuong() {
        return foodXuHuong;
    }

    public void setFoodXuHuong(String foodXuHuong) {
        this.foodXuHuong = foodXuHuong;
    }

    public String getTenfood() {
        return tenfood;
    }

    public void setTenfood(String tenfood) {
        this.tenfood = tenfood;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
