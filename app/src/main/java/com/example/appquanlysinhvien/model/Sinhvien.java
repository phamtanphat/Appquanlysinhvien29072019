package com.example.appquanlysinhvien.model;


public class Sinhvien {
    private String ten;
    private String lop;
    private String diachi;

    public Sinhvien(String ten, String lop, String diachi) {
        this.ten = ten;
        this.lop = lop;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
