package com.example.DuAn1_CP16306_Nhom2.model;

public class MamaDrink {
    String TenD,MotaD,HinhanhD,HinhanhD2,HinhanhD3;
    int GiaD,MaD,IdD;

    public MamaDrink() {
    }

    public MamaDrink(String tenD, String motaD, String hinhanhD, String hinhanhD2, String hinhanhD3, int giaD, int maD, int idD) {
        TenD = tenD;
        MotaD = motaD;
        HinhanhD = hinhanhD;
        HinhanhD2 = hinhanhD2;
        HinhanhD3 = hinhanhD3;
        GiaD = giaD;
        MaD = maD;
        IdD = idD;
    }

    public String getHinhanhD2() {
        return HinhanhD2;
    }

    public void setHinhanhD2(String hinhanhD2) {
        HinhanhD2 = hinhanhD2;
    }

    public String getHinhanhD3() {
        return HinhanhD3;
    }

    public void setHinhanhD3(String hinhanhD3) {
        HinhanhD3 = hinhanhD3;
    }

    public MamaDrink(String tenD, String motaD, String hinhanhD, int giaD, int maD, int idD) {
        TenD = tenD;
        MotaD = motaD;
        HinhanhD = hinhanhD;
        GiaD = giaD;
        MaD = maD;
        IdD = idD;
    }

    public String getTenD() {
        return TenD;
    }

    public void setTenD(String tenD) {
        TenD = tenD;
    }

    public String getMotaD() {
        return MotaD;
    }

    public void setMotaD(String motaD) {
        MotaD = motaD;
    }

    public String getHinhanhD() {
        return HinhanhD;
    }

    public void setHinhanhD(String hinhanhD) {
        HinhanhD = hinhanhD;
    }

    public int getGiaD() {
        return GiaD;
    }

    public void setGiaD(int giaD) {
        GiaD = giaD;
    }

    public int getMaD() {
        return MaD;
    }

    public void setMaD(int maD) {
        MaD = maD;
    }

    public int getIdD() {
        return IdD;
    }

    public void setIdD(int idD) {
        IdD = idD;
    }
}
