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
//ma
//loai
//gia cu
//gia moi
//size
//mau
//anh truoc
//anh sau
//ghi chu
//ngay san xuat
//hang sx
//gioi tinh

public class sanPham {
    public String ma;
    private String Ten;
    private String loai;
    private String giaCu;
    private String giaMoi;
    private String size;
    private String mau;
    private String anhTruoc;
    private String anhSau;
    private String NgaySanXuat;
    private String hangSX;
    private String gioiTinh;
    private String ghiChu;

    public sanPham() {
    }

    public sanPham(String ma, String Ten, String loai, String giaCu, String giaMoi, String size, String mau, String anhTruoc, String anhSau, String NgaySanXuat, String hangSX, String gioiTinh, String ghiChu) {
        this.ma = ma;
        this.Ten = Ten;
        this.loai = loai;
        this.giaCu = giaCu;
        this.giaMoi = giaMoi;
        this.size = size;
        this.mau = mau;
        this.anhTruoc = anhTruoc;
        this.anhSau = anhSau;
        this.NgaySanXuat = NgaySanXuat;
        this.hangSX = hangSX;
        this.gioiTinh = gioiTinh;
        this.ghiChu = ghiChu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGiaCu() {
        return giaCu;
    }

    public void setGiaCu(String giaCu) {
        this.giaCu = giaCu;
    }

    public String getGiaMoi() {
        return giaMoi;
    }

    public void setGiaMoi(String giaMoi) {
        this.giaMoi = giaMoi;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getAnhTruoc() {
        return anhTruoc;
    }

    public void setAnhTruoc(String anhTruoc) {
        this.anhTruoc = anhTruoc;
    }

    public String getAnhSau() {
        return anhSau;
    }

    public void setAnhSau(String anhSau) {
        this.anhSau = anhSau;
    }

    public String getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(String NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    

    
    
    
    
}
