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
public class gioHang_sp extends sanPham{
    private String email;
    private String thoiGianMua;

    public gioHang_sp() {
    }

    public gioHang_sp(String email, String thoiGianMua) {
        this.email = email;
        this.thoiGianMua = thoiGianMua;
    }

    public gioHang_sp(String email, String thoiGianMua, String ma, String Ten, String loai, String giaCu, String giaMoi, String size, String mau, String anhTruoc, String anhSau, String NgaySanXuat, String hangSX, String gioiTinh, String ghiChu) {
        super(ma, Ten, loai, giaCu, giaMoi, size, mau, anhTruoc, anhSau, NgaySanXuat, hangSX, gioiTinh, ghiChu);
        this.email = email;
        this.thoiGianMua = thoiGianMua;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThoiGianMua() {
        return thoiGianMua;
    }

    public void setThoiGianMua(String thoiGianMua) {
        this.thoiGianMua = thoiGianMua;
    }
    
    
}
