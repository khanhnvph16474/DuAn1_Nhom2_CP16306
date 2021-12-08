package com.example.DuAn1_CP16306_Nhom2.model;

public class LoginUser {
    int MaU, IdU;
    String TdnU,PassU;

    public LoginUser(int maU, int idU, String tdnU, String passU) {
        MaU = maU;
        IdU = idU;
        TdnU = tdnU;
        PassU = passU;
    }

    public LoginUser() {
    }

    public int getMaU() {
        return MaU;
    }

    public void setMaU(int maU) {
        MaU = maU;
    }

    public int getIdU() {
        return IdU;
    }

    public void setIdU(int idU) {
        IdU = idU;
    }

    public String getTdnU() {
        return TdnU;
    }

    public void setTdnU(String tdnU) {
        TdnU = tdnU;
    }

    public String getPassU() {
        return PassU;
    }

    public void setPassU(String passU) {
        PassU = passU;
    }
}
