/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author thao
 */
public class hoaDon {
    public String email;
    public String tenNguoiNhan;
    public String diaChiNguoiNhan;
    public String thoiGianNhan;
    public String soDT;
    public String maSP;
    public String tenSP;
    public String tongTien;

    public hoaDon() {
    }

    public hoaDon(String email, String tenNguoiNhan, String diaChiNguoiNhan, String thoiGianNhan, String soDT, String maSP, String tenSP, String tongTien) {
        this.email = email;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChiNguoiNhan = diaChiNguoiNhan;
        this.thoiGianNhan = thoiGianNhan;
        this.soDT = soDT;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tongTien = tongTien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChiNguoiNhan() {
        return diaChiNguoiNhan;
    }

    public void setDiaChiNguoiNhan(String diaChiNguoiNhan) {
        this.diaChiNguoiNhan = diaChiNguoiNhan;
    }

    public String getThoiGianNhan() {
        return thoiGianNhan;
    }

    public void setThoiGianNhan(String thoiGianNhan) {
        this.thoiGianNhan = thoiGianNhan;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
