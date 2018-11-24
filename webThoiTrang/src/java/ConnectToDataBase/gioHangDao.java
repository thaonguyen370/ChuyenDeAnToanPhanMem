/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToDataBase;

import Model.gioHang_sp;
import Model.sanPham;
import Model.user;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thao
 */
public class gioHangDao {

    public boolean add(gioHang_sp sanPham) {
        connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("INSERT into giohang VALUES('" + sanPham.getMa() + "', '" + sanPham.getTen() + "', '" + sanPham.getLoai() + "', '" + sanPham.getGiaCu() + "', '" + sanPham.getGiaMoi() + "', '" + sanPham.getSize() + "', '" + sanPham.getMau() + "', '" + sanPham.getAnhTruoc() + "', '" + sanPham.getAnhSau() + "', '" + sanPham.getNgaySanXuat() + "', '" + sanPham.getHangSX() + "', '" + sanPham.getGioiTinh() + "', '" + sanPham.getGhiChu() + "', '" + sanPham.getEmail() + "', '" + sanPham.getThoiGianMua() + "')");
            if (val == 1) {
                System.out.println("thanh cong");
                x.closeConnection();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<gioHang_sp> list(String email_x) {
        ArrayList<gioHang_sp> v = new ArrayList<>();
        try {
            connection x = new connection();
            Statement st = x.statement();
            ResultSet res = st.executeQuery("SELECT * FROM giohang");
            while (res.next()) {
                String ma = res.getString("ma");
                String Ten = res.getString("ten");
                String loai = res.getString("loai");
                String giaCu = res.getString("giaCu");
                String giaMoi = res.getString("giaMoi");
                String size = res.getString("size");
                String mau = res.getString("mau");
                String anhTruoc = res.getString("anhTruoc");
                String anhSau = res.getString("anhSau");
                String NgaySanXuat = res.getString("ngaySanXuat");
                String hangSX = res.getString("hangSX");
                String gioiTinh = res.getString("gioiTinh");
                String ghiChu = res.getString("ghiChu");
                String email = res.getString("email");
                String ngayMua = res.getString("ngayMua");
                if (email.equals(email_x)) {
                    v.add(new gioHang_sp(email, ngayMua, ma, Ten, loai, giaCu, giaMoi, size, mau, anhTruoc, anhSau, NgaySanXuat, hangSX, gioiTinh, ghiChu));
                }
            }
           
            x.closeConnection();
            return v;
        } catch (SQLException ex) {
            return null;
            // Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    public boolean remove(String ma, String email, String ghiChu) {
         connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("DELETE FROM giohang WHERE ma='"+ma+"' AND email='"+email+"' AND ghiChu='"+ghiChu+"'");
            if (val == 1) {
                System.out.println("thanh cong");
                x.closeConnection();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public boolean removeGioHangTheoEmail( String email) {
         connection x = new connection();
        Statement st = x.statement();
        try {
            int val = st.executeUpdate("DELETE FROM giohang WHERE email='"+email+"'");
            if (val == 1) {
                System.out.println("thanh cong");
                x.closeConnection();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
